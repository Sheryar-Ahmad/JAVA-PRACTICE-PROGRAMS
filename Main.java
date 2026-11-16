import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// 1. A Generic Class (works with any type T)
class Repository<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    // 2. A method that accepts a Lambda expression (Functional Interface: Predicate)
    public List<T> filter(Predicate<T> condition) {
        return items.stream()
                .filter(condition) // Intermediate stream operation
                .collect(Collectors.toList()); // Terminal operation
    }

    public List<T> getItems() {
        return items;
    }
}

// A simple domain model
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a repository specifically for 'Product'
        Repository<Product> productRepo = new Repository<>();
        productRepo.add(new Product("Laptop", 1200.00));
        productRepo.add(new Product("Mouse", 25.50));
        productRepo.add(new Product("Monitor", 300.00));
        productRepo.add(new Product("Keyboard", 45.00));

        // Use a Lambda Expression to filter products expensive than $100
        List<Product> expensiveProducts = productRepo.filter(p -> p.getPrice() > 100.00);

        System.out.println("Expensive Products:");
        expensiveProducts.forEach(System.out::println); // Method reference
    }
}
