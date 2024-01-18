import java.util.Scanner;

public class PrimeNumberChecker {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      checkForPrime(scanner);
      restart = HelperMethods.getRestart(scanner, "Prime Number Checker");
    }
  }

  public static void checkForPrime(Scanner inputScanner) {
    System.out.println("\nWhich number do you want to check? It has to be a positive number greater than 1:\n");

    // Input validation for a positive integer greater than 1
    int numToCheck;
    do {
      while (!inputScanner.hasNextInt()) {
        System.out.println("Invalid input. Please enter a positive integer greater than 1.");
        inputScanner.next(); // Consume the invalid input
      }
      numToCheck = inputScanner.nextInt();
      if (numToCheck <= 1) {
        System.out.println("Invalid input. Please enter a positive integer greater than 1.");
      } else if (numToCheck < 0) {
        System.out.println(
            "Invalid input. Please enter a positive integer greater than 1 (negative numbers are not allowed).");
      }
    } while (numToCheck <= 1 || numToCheck < 0);

    boolean isPrime = true;
    StringBuilder divisors = new StringBuilder();

    for (int i = 2; i <= numToCheck / 2; i++) {
      if (numToCheck % i == 0) {
        isPrime = false;
        divisors.append(i).append(", ");
      }
    }

    if (isPrime) {
      System.out.println("\nPrime!");
    } else {
      divisors.setLength(divisors.length() - 2); // Remove the trailing comma and space
      System.out.println("\nNot prime. It can be divided by: " + divisors + "\n");
    }
  }
}
