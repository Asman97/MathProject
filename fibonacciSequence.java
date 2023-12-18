import java.util.Scanner;

public class fibonacciSequence {
    private static long[] fibonacciCache;

    public static void run3(Scanner scanner) {

        System.out.println("Please enter how long you want the Fibonacci series to be.");

        Integer n = scanner.nextInt();

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

/*
 * System.out.
 * println("Please enter how long you want the Fibonacci series to be.");
 * int a = scanner.nextInt();
 * int b = scanner.nextInt();
 * int c = scanner.nextInt();
 * 
 * int count = 0;
 * 
 * for(int i=a; i<=b; i++){
 * if(i%a == 0){
 * count ++;
 * }
 * }
 * System.out.println(count);
 */

/*
 * static int fibo(int n){
 * if (n==1 || n==2) {
 * return 1;
 * }
 * return fibo(n-1) + fibo(n-2);
 * }
 */