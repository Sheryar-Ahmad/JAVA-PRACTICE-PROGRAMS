import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class OrderProcessingEngine {

    // Sealed interface restricts PaymentMethod to ONLY these 3 records (needed for switch pattern matching later)
    public sealed interface PaymentMethod permits CreditCard, BankTransfer, DigitalWallet {}
    public record CreditCard(String cardNumber, String holderName) implements PaymentMethod {}
    public record BankTransfer(String iban, String bankName) implements PaymentMethod {}
    public record DigitalWallet(String provider, String accountId) implements PaymentMethod {}

    public record Order(
            String orderId,
            String customerName,
            double amount,
            PaymentMethod paymentMethod,
            LocalDateTime timestamp
    ) {}

    public static class PaymentProcessingException extends Exception {
        public PaymentProcessingException(String message) {
            super(message);
        }
    }

    // Using ConcurrentHashMap instead of regular HashMap because multiple threads write to it at the same time
    private final Map<String, String> orderStatusLog = new ConcurrentHashMap<>();
    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    private String processPayment(Order order) throws PaymentProcessingException {
        if (order.amount() <= 0) {
            throw new PaymentProcessingException("Invalid order amount for " + order.orderId());
        }

        simulateLatency(500);

        // Pattern matching switch: no 'default' needed because PaymentMethod is sealed
        return switch (order.paymentMethod()) {
            case CreditCard cc -> "Charged $" + order.amount() + " to Card ending in " + cc.cardNumber().substring(cc.cardNumber().length() - 4);
            case BankTransfer bt -> "Initiated IBAN transfer of $" + order.amount() + " via " + bt.bankName();
            case DigitalWallet dw -> "Deducted $" + order.amount() + " from " + dw.provider() + " (" + dw.accountId() + ")";
        };
    }

    public void processBatch(List<Order> orders) {
        List<CompletableFuture<Void>> futures = orders.stream()
                .map(order -> CompletableFuture.runAsync(() -> {
                    try {
                        String receipt = processPayment(order);
                        orderStatusLog.put(order.orderId(), "SUCCESS: " + receipt);
                    } catch (PaymentProcessingException e) {
                        orderStatusLog.put(order.orderId(), "FAILED: " + e.getMessage());
                    }
                }, executor))
                .toList();

        // Pause main thread here until every async order in the list finishes
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
    }

    public void printAnalyticsReport(List<Order> orders) {
        System.out.println("\n--- ORDER EXECUTION LOG ---");
        orderStatusLog.forEach((id, status) -> System.out.println(id + " -> " + status));

        double totalRevenue = orders.stream()
                .filter(o -> orderStatusLog.getOrDefault(o.orderId(), "").startsWith("SUCCESS"))
                .mapToDouble(Order::amount)
                .sum();

        // Group orders by their record class name (CreditCard, BankTransfer, etc.) and count them
        Map<String, Long> paymentTypeBreakdown = orders.stream()
                .collect(Collectors.groupingBy(
                        o -> o.paymentMethod().getClass().getSimpleName(),
                        Collectors.counting()
                ));

        System.out.println("\n--- ANALYTICS SUMMARY ---");
        System.out.printf("Total Successful Revenue: $%.2f%n", totalRevenue);
        System.out.println("Orders by Payment Type: " + paymentTypeBreakdown);
    }

    public void shutdown() {
        executor.shutdown(); // Always close the thread pool or the JVM won't exit
    }

    private void simulateLatency(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        OrderProcessingEngine engine = new OrderProcessingEngine();

        List<Order> sampleOrders = List.of(
                new Order("ORD-101", "Ali", 250.00, new CreditCard("4111222233334444", "Ali Raza"), LocalDateTime.now()),
                new Order("ORD-102", "Sara", 1200.50, new BankTransfer("PK36SCBL0000001123456702", "Standard Chartered"), LocalDateTime.now()),
                new Order("ORD-103", "Omar", 75.25, new DigitalWallet("SadaPay", "omar@wallet"), LocalDateTime.now()),
                new Order("ORD-104", "Zara", -50.00, new CreditCard("5500111122223333", "Zara Khan"), LocalDateTime.now()), // Intentionally invalid to test exception
                new Order("ORD-105", "Hamza", 430.00, new DigitalWallet("NayaPay", "hamza@wallet"), LocalDateTime.now())
        );

        System.out.println("Processing " + sampleOrders.size() + " orders concurrently...");
        long startTime = System.currentTimeMillis();

        engine.processBatch(sampleOrders);
        engine.printAnalyticsReport(sampleOrders);
        engine.shutdown();

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("\nCompleted in " + elapsedTime + "ms (Parallel execution)");
    }
}
