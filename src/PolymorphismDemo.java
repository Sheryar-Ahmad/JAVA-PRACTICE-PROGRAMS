// Common Superclass / Interface
abstract class PaymentMethod {
    abstract void processPayment(double amount);
}

// Subclass 1: Credit Card
class CreditCardPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Charged $" + amount + " to Credit Card (with 2% processing fee).");
    }
}

// Subclass 2: Crypto Wallet
class CryptoPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Transferred $" + amount + " via blockchain network (gas fee applied).");
    }
}

// Subclass 3: Gift Card
class GiftCardPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Deducted $" + amount + " directly from store gift card balance.");
    }
}

// Main Class to test Polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        // A single array of the superclass type holding different objects
        PaymentMethod[] wallet = {
            new CreditCardPayment(),
            new CryptoPayment(),
            new GiftCardPayment()
        };

        double billAmount = 150.50;

        // Loop through each payment method and call processPayment()
        System.out.println("Processing bill of $" + billAmount + " via different methods:\n");
        for (PaymentMethod method : wallet) {
            // Polymorphism in action: JVM figures out the actual object type at runtime
            method.processPayment(billAmount);
        }
    }
}
