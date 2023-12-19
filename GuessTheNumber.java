import java.util.Scanner;

public class GuessTheNumber {
    public static void run4(Scanner scanner) {

        try {
            System.out.println("Guess the number between 0 and 50,you have 5 trials!");
            Integer guessedNumber = getUserInput2(scanner);
            if (guessedNumber > 50) {
                System.out.println("The number is out of valid range!");
            }
            int number = 1 + (int) (50 * Math.random());

            int trials = 5;

            for (int i = 0; i < trials; i++) {
                getUserInput2(scanner);
                guessedNumber = scanner.nextInt();

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
        } catch (Exception e) {
            System.out.println("An error occurred in MultiplicationTable");
            System.out.println(e);
        }

    }

    private static int getUserInput2(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int guessedNumber = scanner.nextInt();
            return guessedNumber;
        } else {
            scanner.next();
        }
        System.out.println("Your input was invalid, please enter a number:");
        return getUserInput2(scanner);
    }

}
