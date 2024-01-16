import java.util.Scanner;

public class FibonacciSeries {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      processingFibonacci(scanner);
      restart = HelperMethods.getRestart(scanner, "Fibonacci Series");
    }
  }

  private static void processingFibonacci(Scanner inputScanner) {
    System.out.println(
      "\n\nEnter how long you want the Fibonacci series to be, max is 92.\n"
    );
    Integer userInput = inputScanner.nextInt();

    if (userInput < 1 || userInput > 93) {
      System.out.print(
        "\nYour number was either too low (below 0) or too high (above 93) : "
      );
      return;
    } else {
      long firstArray = 0, secondArray = 1;
      System.out.println("\nFibonacci Series of " + userInput + " 3is: \n");

      for (int i = 1; i <= userInput; i++) {
        System.out.print(firstArray);
        if (i <= userInput - 1) {
          System.out.print(", ");
        }

        long nextArray = firstArray + secondArray;
        firstArray = secondArray;
        secondArray = nextArray;
      }
    }
  }
}
