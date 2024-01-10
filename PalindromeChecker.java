

import java.util.*;

public class PalindromeChecker {
   public static void firstProg(Scanner scanner) {

      System.out.println("Which word would you like to check?");
     
		String inputString = scanner.next();

		
		inputString = inputString.toLowerCase();
		
		if (isPalindrome(inputString)){

			
			System.out.print("It's palindrome :)");
      }

		else{
        
			System.out.print("It's not palindrome");
      }
   }

   	static boolean isPalindrome(String inpuString){


		int start = 0, end = inpuString.length() - 1;

		// While there are characters to compare
		while (start < end) {

			// If there is a mismatch
			if (inpuString.charAt(start) != inpuString.charAt(end))
				return false;

			// Increment first pointer and
			// decrement the other
			start++;
			end--;
		}

		// Given string is a palindrome
		return true;
	}
}














