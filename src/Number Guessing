import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            
            // Check if the input is actually an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid whole number.");
                scanner.next(); // Clear the invalid input
                continue;
            }
            
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("\nCongratulations! You guessed the number!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
