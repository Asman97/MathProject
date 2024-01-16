import java.util.*;

public class PalindromeChecker {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      checkForPalindrome(getUserInput(scanner));
      restart = HelperMethods.getRestart(scanner, "Palindrome Checker");
    }
  }

  public static String getUserInput(Scanner userInput) {
    System.out.print("\n\nWhich word would you like to check? : ");
    return HelperMethods.getWord(userInput);
  }

  public static void checkForPalindrome(String userInput) {
    String inputString = userInput;
    inputString = inputString.toLowerCase();

    if (isItPalindrome(inputString)) {
      System.out.print("\nIt's palindrome :) \n");
    } else {
      System.out.print("\nIt's not palindrome\n");
    }
  }

  private static boolean isItPalindrome(String inpuString) {
    int start = 0, end = inpuString.length() - 1;
    while (start <= end) {
      if (inpuString.charAt(start) != inpuString.charAt(end)) {
        return false;
      }
      end--;
    }
    return true;
  }
}
