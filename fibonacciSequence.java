import java.util.Scanner;

public class fibonacciSequence {
    private static long[] fibonacciCache;

    public static void run3(Scanner scanner) {

        System.out.println("Enter how long you want the Fibonacci series to be.");
         Integer n = getUserInput4(scanner);
        

        n = scanner.nextInt();

        fibonacciCache = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");

        }

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
    private static int getUserInput4(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int guessedNumber = scanner.nextInt();
            return guessedNumber;
        } else {
            scanner.next();
        }
        System.out.println("Your input was invalid, please enter a number:");
        return getUserInput4(scanner);
    }
}
