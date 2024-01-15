import java.util.Scanner;

public class GuessTheNumber {
    public static void run(Scanner scanner) {
        boolean restart = true;
        while (restart) {
            resultGuessNGame(scanner);
            restart = HelperMethods.getRestart(scanner, "Guess Number Game");
        }
    }

    public static void resultGuessNGame(Scanner input) {
        try {
            System.out.println("\nGuess the number between 0 and 50,you have 5 trials!\n");
            Integer guessedNumber = input.nextInt();
            if (guessedNumber > 50) {
                System.out.println("\nThe number is out of valid range!\n");
            }
            int number = 1 + (int) (50 * Math.random());

            int trials = 5;

            for (int i = 0; i < trials; i++) {

                guessedNumber = input.nextInt();

                if (guessedNumber == number) {
                    System.out.println("\nCongrats! Thats Correct!\n");
                }

                else if (number > guessedNumber && i != trials - 1) {
                    System.out.println("\nYour number is greater than the number to guess.\n");
                }

                else if (number < guessedNumber && i != trials - 1) {
                    System.out.println("\nYour number is less than the number to guess\n");
                }

            }
            if (trials == 5) {
                System.out.println("\nYou used all 5 trials.\n");
                System.out.println("The number was " + number);

            }
        } catch (Exception e) {
            System.out.println("\nAn error occurred in MultiplicationTable\n");
            System.out.println(e);
        }
    }

}
