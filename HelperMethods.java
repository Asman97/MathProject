import java.util.Scanner;

public class HelperMethods {

  public static int getNumber(Scanner scNumber) {
    int number;
    while (!scNumber.hasNextInt()) {
      if (scNumber.hasNextDouble()) {
        System.out.print(
          "\n" +
          scNumber.next() +
          " is not a valid integer. Please enter a valid integer : "
        );
      } else {
        System.out.print(
          "\n" +
          scNumber.next() +
          " is not a valid number. Please enter a valid number : "
        );
      }
    }
    number = scNumber.nextInt();
    return number;
  }

  public static int getPositiveNumber(Scanner scNumber) {
    int number;

    while (true) {
      number = getNumber(scNumber);

      if (number > 0 && number <= 2147483647) {
        break;
      } else if (number <= 0) {
        System.out.print("\nPlease enter a positive number higher than 0: ");
      } else {
        System.out.print(
          "\nPlease enter a number smaller than or equal to 2147483647: "
        );
      }
    }
    return number;
  }

  public static int receiveNumber(Scanner scNumber, String name) {
    System.out.print("\n\n\nEnter a Number for the " + name + " : ");
    int number = getPositiveNumber(scNumber);
    return number;
  }

  public static String getWord(Scanner scWord) {
    while (scWord.hasNextInt()) {
      System.out.print(
        "\nThat is not a valid word. Please enter a valid word : "
      );
      scWord.next();
    }
    scWord.nextLine();
    return scWord.nextLine();
  }

  public static boolean getRestart(Scanner scanner, String name) {
    System.out.print(
      "\n\n\nWould you like to see another " +
      name +
      " enter 'y', to stop the program enter something else : \n\n"
    );
    String choice = scanner.next();
    return choice.equalsIgnoreCase("y");
  }
}
