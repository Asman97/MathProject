
import java.util.Scanner;

public class ArrayManipulation {
    public static void fourthProg(Scanner scanner) {
		int arrayLength = 0;

		System.out.println("How long do you want your array to be? ");
		arrayLength = scanner.nextInt();
		double[] myArray = new double[arrayLength];

		//min
		double min = Double.MAX_VALUE;

		//max
		double max = Double.MAX_VALUE;

		for(int i = 0; i < arrayLength; i++){
			System.out.println("#" + (i+1) + ": ");
			myArray[i] = scanner.nextDouble();
			System.out.println("");
		}

		//sum
		double sum = 0;
		for(int i = 0; i < myArray.length; i++){
			sum = sum + myArray[i];
		}
		//average
		double average = 0; 
		average = sum/arrayLength;

		// min
		for (int i = 0; i<arrayLength; i++){
			min = Math.min(min, myArray[i]);
		}

		//max
		for(int i = 0; i < arrayLength; i++){
			max=Math.max(max, myArray[i]);
		}

	 //outputs
	 System.out.println("The sum is: " + sum);
	 System.out.println("The average is: " + average);
	 System.out.println("The minimum is: " + min);
	 System.out.println("The maximum is: " + max);

}
}

    
