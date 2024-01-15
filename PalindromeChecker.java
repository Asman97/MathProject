
import java.util.*;

public class PalindromeChecker {
	public static void run(Scanner scanner) {

		boolean restart = true;
		while (restart) {
			resultPalindrome(getPalindrome(scanner));
			restart = HelperMethods.getRestart(scanner, "Palindrome Checker");
		}

	}

	public static String getPalindrome(Scanner wordInput) {
		System.out.print("\n\nWhich word would you like to check? : ");

		return HelperMethods.getWord(wordInput);
	}

	public static void resultPalindrome(String wordInput) {

		String inputString = wordInput;

		inputString = inputString.toLowerCase();

		if (isPalindrome(inputString)) {

			System.out.print("\nIt's palindrome :) \n");
		}

		else {

			System.out.print("\nIt's not palindrome\n");
		}
	}

	static boolean isPalindrome(String inpuString) {

		int start = 0, end = inpuString.length() - 1;

		while (start < end) {

			if (inpuString.charAt(start) != inpuString.charAt(end))
				return false;

			end--;
		}

		return true;
	}
}
