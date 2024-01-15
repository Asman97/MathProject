
import java.util.Scanner;

public class ArrayManipulation {
	public static void run(Scanner scanner) {
		boolean restart = true;
		while (restart) {

			resultArrayManipulation(scanner);
			restart = HelperMethods.getRestart(scanner, "Array Manipulation");
		}

	}

	public static void resultArrayManipulation(Scanner scanner) {
		int arrayLength = 0;

		System.out.println("\n\nHow long do you want your array to be? \n");
		arrayLength = scanner.nextInt();
		double[] myArray = new double[arrayLength];

		// min
		double min = Double.MAX_VALUE;

		// max
		double max = Double.MAX_VALUE;

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("\n#" + (i + 1) + ": ");
			myArray[i] = scanner.nextDouble();
			System.out.println("");
		}

		// sum
		double sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		// average
		double average = 0;
		average = sum / arrayLength;

		// min
		for (int i = 0; i < arrayLength; i++) {
			min = Math.min(min, myArray[i]);
		}

		// max
		for (int i = 0; i < arrayLength; i++) {
			max = Math.max(max, myArray[i]);
		}

		// outputs
		System.out.println("\nThe sum is: " + sum + "\n");
		System.out.println("\nThe average is: " + average + "\n");
		System.out.println("\nThe minimum is: " + min + "\n");
		System.out.println("\nThe maximum is: " + max + "\n");
	}
}
