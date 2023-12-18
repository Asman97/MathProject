import java.util.Scanner;

public class GuessTheNumber {
    public static void run4(Scanner scanner) {

        System.out.println("Guess the number between 0 and 50!");
        int number = 1 + (int) (50 * Math.random());

        int trials = 5;

        for (int i = 0; i < trials; i++) {

            Integer guessedNumber = scanner.nextInt();

            if (guessedNumber == number) {
                System.out.println("Congrats! Thats Correct!");
            }

            else if (number > guessedNumber && i != trials - 1) {
                System.out.println("Your number is greater than the number to guess.");
            }

            else if (number < guessedNumber && i != trials - 1) {
                System.out.println("Your number is less than the number to guess");
            }

        }
        if (trials == 5) {
            System.out.println("You used all 5 trials.");
            System.out.println("The number was " + number);

        }
    }
}
