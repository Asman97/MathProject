import java.util.Scanner;

public class Main {

  private static Scanner scanner;

  public static void main(String args[]) {
    try {
      boolean runMainAction = true;
      scanner = new Scanner(System.in);

      while (runMainAction) {
        runMainAction = mainAction(scanner);
      }
    } catch (Exception e) {
      System.out.print("An error occured");
    }
  }

  private static boolean mainAction(Scanner scanner) {
    System.out.println("\n\n\nEnter the number to select an option:");

    System.out.println("\n1. Multiplication table.");
    System.out.println("\n2. Prime Number Checker.");
    System.out.println("\n3. Fibonacci Series.");
    System.out.println("\n4. Guess the Number Game.");
    System.out.println("\n5. Palindrome Checker");
    System.out.println("\n6. String Reversal ");
    System.out.println("\n7. Array Sorting");
    System.out.println("\n8. Array Manipulation.");
    System.out.println("\nTo quit, enter 'q'\n\n");

    String input = scanner.next();
    if (input.equalsIgnoreCase("q")) {
      return false;
    }

    try {
      int userChoice = Integer.parseInt(input);
      if (userChoice < 1 || userChoice > 8) {
        System.out.println("\n'" + userChoice + "' is not a valid input. Please choose a number between 1 and 8.");
      } else {
        performSelectedAction(userChoice, scanner);
      }
    } catch (NumberFormatException e) {
      System.out.println("\nInvalid input. Please enter a valid number between 1 and 8.");
    }

    return true;
  }

  private static void performSelectedAction(int userChoice, Scanner scanner) {
    switch (userChoice) {
      case 1:
        MultiplicationTable.run(scanner);
        break;
      case 2:
        PrimeNumberChecker.run(scanner);
        break;
      case 3:
        FibonacciSeries.run(scanner);
        break;
      case 4:
        GuessTheNumber.run(scanner);
        break;
      case 5:
        PalindromeChecker.run(scanner);
        break;
      case 6:
        StringReversal.run(scanner);
        break;
      case 7:
        ArraySorting.run(scanner);
        break;
      case 8:
        ArrayManipulation.run(scanner);
        break;
      default:
        break;
    }
  }

}
