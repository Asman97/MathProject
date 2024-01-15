import java.util.Scanner;

public class PrimeNumberChecker {

    public static void run(Scanner scanner) {
        boolean restart = true;

        while (restart) {
            resultPNumber(scanner);
            restart = HelperMethods.getRestart(scanner, "Prime Number Checker");
        }

    }

    public static void resultPNumber(Scanner inputScanner) {
        System.out.println();
        System.out.println("Which number do you want to check? It has to be positive number that is greater than 1:");
        System.out.println();
        Integer numToCheck = inputScanner.nextInt();
        boolean isPrime = true;
        String divisors = "";
        for (int i = 1; i <= numToCheck; i++) {
            if (numToCheck % i == 0) {
                isPrime = false;

                divisors += " " + i; // == divisors = divisiors + numToCheck (-=; ++; --)

                if (i < numToCheck) {
                    divisors += ",";
                }

            }
        }

        if (isPrime) {
            System.out.println("\nPrime!");

        } else if (!isPrime) {
            System.out.println("\nNot prime. It can be divided by " + divisors);
            System.out.println();
        }
    }

}
