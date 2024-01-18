import java.util.Scanner;

public class PalindromeChecker {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      checkForPalindrome(getUserInput(scanner));
      restart = HelperMethods.getRestart(scanner, "Palindrome Checker");
    }
  }

  public static String getUserInput(Scanner userInput) {
    String input = "";
    boolean validInput = false;

    while (!validInput) {
      System.out.print("\n\nWhich word would you like to check? : ");
      input = userInput.nextLine().trim(); // Use nextLine to allow spaces, and trim to remove leading/trailing spaces

      // Check if the input contains only letters
      if (input.matches("^[a-zA-Z]+$")) {
        validInput = true;
      } else {
        System.out.println("Invalid input. Please enter only letters.");
      }
    }

    return input;
  }

  public static void checkForPalindrome(String userInput) {
    String inputString = userInput.toLowerCase();

    if (isItPalindrome(inputString)) {
      System.out.print("\nIt's palindrome :) \n");
    } else {
      System.out.print("\nIt's not palindrome\n");
    }
  }

  private static boolean isItPalindrome(String inputString) {
    int start = 0, end = inputString.length() - 1;
    while (start <= end) {
      if (inputString.charAt(start) != inputString.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
