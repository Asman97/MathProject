import java.util.Scanner;

public class FibonacciSeries {
    private static long[] fibonacciCache;

    public static void run(Scanner scanner) {
        boolean restart = true ;
 
        while(restart){
            resultFibonacci(scanner);
            restart = HelperMethods.getRestart(scanner, "Fibonacci Series");
        }
    }

    private static void resultFibonacci(Scanner inputScanner) {
        System.out.println("\n\nEnter how long you want the Fibonacci series to be, max is 92.\n");
        

        Integer n = inputScanner.nextInt();

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

}
