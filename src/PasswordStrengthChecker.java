import java.util.Scanner;
import java.util.Random;

public class PasswordHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== Special Password Tool ===");
        System.out.println("1. Check your password strength");
        System.out.println("2. Generate a secure random password");
        System.out.print("Choose option (1 or 2): ");
        
        int option = scanner.nextInt();
        scanner.nextLine(); // Clear the text entry buffer
        
        switch (option) {
            case 1:
                // Special concept: Length-based strength evaluator
                System.out.print("\nEnter your password to test: ");
                String password = scanner.nextLine();
                
                if (password.length() < 6) {
                    System.out.println("Result: Dangerously Weak! (Too short)");
                } else if (password.length() < 10) {
                    System.out.println("Result: Moderate. (Could be longer)");
                } else {
                    System.out.println("Result: Strong! (Great length)");
                }
                break;
                
            case 2:
                // Special concept: Character pool selector
                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$";
                String newPassword = "";
                
                // Loops 8 times to pick 8 random characters from the text pool above
                for (int i = 0; i < 8; i++) {
                    int randomIndex = random.nextInt(characters.length());
                    newPassword += characters.charAt(randomIndex);
                }
                
                System.out.println("\n Your Generated Password: " + newPassword);
                break;
                
            default:
                System.out.println("Invalid option selected.");
        }
        
        scanner.close();
    }
}
