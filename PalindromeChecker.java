
// Java program to find palindrome number
import java.util.*;

public class PalindromeChecker {
   public static void firstProg(Scanner scanner) {

      try {
         
      String userInput, reversed = "";

      System.out.println("\n" + "Which word would you like to check?" + "\n");
      userInput = scanner.nextLine();

      int length = userInput.length();

      for (int i = length - 1; i >= 0; i--)
         reversed = reversed + userInput.charAt(i);

      if (userInput.equals(reversed))
         System.out.println(userInput + " is a palindrome :)");
      else
         System.out.println(userInput + " is not a palindrome");
      } catch (Exception e) {
         System.out.println("Error occured");
      }


   }
}