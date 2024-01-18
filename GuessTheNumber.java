import java.util.Scanner;

public class GuessTheNumber {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      guessingTheNumber(scanner);
      restart = HelperMethods.getRestart(scanner, "Guess Number Game");
    }
  }

  public static void guessingTheNumber(Scanner input) {
    System.out.println("\nGuess the number between 1 and 50, you have 5 trials!\n");

    int number = generateRandomNumber();
    int trials = 5;

    for (int i = 0; i < trials; i++) {
      int guessedNumber = getUserGuess(input);

      if (guessedNumber == number) {
        System.out.println("\nCongratulations! That's correct!\n");
        return; // Exit the method since the guess is correct
      } else if (guessedNumber < number) {
        System.out.println("\nYour guess is too low.\n");
      } else {
        System.out.println("\nYour guess is too high.\n");
      }
    }

    System.out.println("\nYou used all 5 trials.\n");
    System.out.println("The number was " + number);
  }

  private static int getUserGuess(Scanner input) {
    while (true) {
      System.out.print("Enter your guess: ");
      if (input.hasNextInt()) {
        int guessedNumber = input.nextInt();
        if (guessedNumber >= 1 && guessedNumber <= 50) {
          return guessedNumber;
        } else {
          System.out.println("Please enter a number between 1 and 50.");
        }
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        input.next(); // Consume the invalid input
      }
    }
  }

  private static int generateRandomNumber() {
    return 1 + (int) (50 * Math.random());
  }
}
