import java.util.Scanner;

public class ArrayManipulation {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      manipulateArray(scanner);
      restart = HelperMethods.getRestart(scanner, "Array Manipulation");
    }
  }

  private static void manipulateArray(Scanner scanner) {
    System.out.println("\n\nHow long do you want your array to be?");
    int arrayLength = scanner.nextInt();
    double[] userInput = new double[arrayLength];

    inputArrayNumbers(scanner, userInput);

    double sum = calculateSum(userInput);
    double average = calculateAverage(sum, arrayLength);
    double min = findMin(userInput);
    double max = findMax(userInput);

    displayResults(sum, average, min, max);
  }

  private static void inputArrayNumbers(Scanner scanner, double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("\n#" + (i + 1) + ": ");
      array[i] = scanner.nextDouble();
      System.out.println("");
    }
  }

  private static double calculateSum(double[] array) {
    double sum = 0;
    for (double number : array) {
      sum += number;
    }
    return sum;
  }

  private static double calculateAverage(double sum, int arrayLength) {
    return sum / arrayLength;
  }

  private static double findMin(double[] array) {
    double min = array[0];
    for (double number : array) {
      if (number < min) {
        min = number;
      }
    }
    return min;
  }

  private static double findMax(double[] array) {
    double max = array[0];
    for (double number : array) {
      if (number > max) {
        max = number;
      }
    }
    return max;
  }

  private static void displayResults(
    double sum,
    double average,
    double min,
    double max
  ) {
    System.out.println("\nThe sum is: " + sum + "\n");
    System.out.println("\nThe average is: " + average + "\n");
    System.out.println("\nThe minimum is: " + min + "\n");
    System.out.println("\nThe maximum is: " + max + "\n");
  }
}
