
import java.util.Scanner;

public class ArrayManipulation {
	public static void run(Scanner scanner) {
		boolean restart = true;
		while (restart) {
			ManipulateArray(scanner);
			restart = HelperMethods.getRestart(scanner, "Array Manipulation");
		}
	}

	private static void ManipulateArray(Scanner scanner) {

		System.out.println("\n\nHow long do you want your array to be?");
		int arrayLength = scanner.nextInt();
		double[] userInput = new double[arrayLength];

		// min
		double min = Double.MIN_VALUE;

		// max
		double max = Double.MAX_VALUE;

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("\n#" + (i + 1) + ": ");
			userInput[i] = scanner.nextDouble();
			System.out.println("");
		}

		// sum
		double sum = 0;
		for (int i = 0; i < userInput.length; i++) {
			sum = sum + userInput[i];
		}
		// average
		double average = sum / arrayLength;

		// min
		for (int i = 0; i < arrayLength; i++) {
			min = Math.min(min, userInput[i]);
		}

		// max
		for (int i = 0; i < arrayLength; i++) {
			max = Math.max(max, userInput[i]);
		}

		// outputs
		System.out.println("\nThe sum is: " + sum + "\n");
		System.out.println("\nThe average is: " + average + "\n");
		System.out.println("\nThe minimum is: " + min + "\n");
		System.out.println("\nThe maximum is: " + max + "\n");
	}

}
