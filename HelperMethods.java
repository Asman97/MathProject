import java.util.Scanner;

public class HelperMethods {

  public static int getNumber(Scanner scNumber) {
    int number;
    while (!scNumber.hasNextInt()) {
      if (scNumber.hasNextDouble()) {
        System.out.print(
            "\n" +
                scNumber.next() +
                " is not a valid integer. Please enter a valid integer : ");
      } else {
        System.out.print(
            "\n" +
                scNumber.next() +
                " is not a valid number. Please enter a valid number : ");
      }
    }
    number = scNumber.nextInt();
    return number;
  }

  public static int getPositiveNumber(Scanner scanner) {
    int number;

    while (true) {
      number = getNumber(scanner);

      if (number > 0 && number <= 2147483647) {
        break;
      } else if (number <= 0) {
        System.out.print("\nPlease enter a positive number higher than 0: ");
      } else {
        System.out.print(
            "\nPlease enter a number smaller than or equal to 2147483647: ");
      }
    }
    return number;
  }

  static Integer receiveNumber(Scanner scanner, String operationName) {
    Integer number = null;
    boolean validInput = false;

    while (!validInput) {
      System.out.print("\nEnter a number for " + operationName + ": ");
      if (scanner.hasNextInt()) {
        number = scanner.nextInt();
        validInput = true;
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next();
      }
    }

    return number;
  }

  public static String getWord(Scanner scWord) {
    String word;

    while (true) {
      System.out.print("\nEnter a word: ");
      word = scWord.next();

      if (word.matches("[a-zA-Z]+")) {
        // The input is a valid word
        break;
      } else {
        System.out.println("Invalid input. Please enter a valid word.");
      }
    }

    return word;
  }

  public static boolean getRestart(Scanner scanner, String name) {
    System.out.print(
        "\n\n\nWould you like to see another " +
            name +
            " enter 'y', to stop the program enter something else : \n\n");
    String choice = scanner.next();
    return choice.equalsIgnoreCase("y");
  }

  public static int getIntInput(Scanner scanner, String prompt) {
    int input = 0;
    boolean isValidInput = false;

    while (!isValidInput) {
      System.out.print(prompt);

      if (scanner.hasNextInt()) {
        input = scanner.nextInt();
        isValidInput = true;
      } else {
        System.out.println("Invalid input. Please enter a valid integer.");
        scanner.next(); // Consume the invalid input
      }
    }

    return input;
  }
}
