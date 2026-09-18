import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            Random random = new Random();

            int number = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\n================================");
            System.out.println("      NUMBER GUESSING GAME");
            System.out.println("================================");
            System.out.println("I selected a number between 1 and 100.");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess < number) {
                    System.out.println("Too Low!");
                }
                else if (guess > number) {
                    System.out.println("Too High!");
                }
                else {
                    System.out.println("\nCongratulations! 🎉");
                    System.out.println("You guessed the correct number.");
                    System.out.println("Attempts used: " + attempts);

                    int score = (maxAttempts - attempts + 1) * 10;
                    System.out.println("Your Score: " + score);

                    break;
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            if (guess != number) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + number);
                System.out.println("Your Score: 0");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}