import java.util.Scanner;

public class PrimeNumberChecker {

    public static void run2(Scanner scanner) {
        System.out.println();
        System.out.println("Which number do you want to check? It has to be positive number that is greater than 1:");
        System.out.println();
        Integer numToCheck = scanner.nextInt();
        boolean isPrime = true;
        String divisors = "";
        for (int i = 1; i <= numToCheck; i++) {
            if (numToCheck % i == 0) {
                isPrime = false;

                divisors += " " + i; // == divisors = divisiors + numToCheck (-=; ++; --)

                if(i<numToCheck){
                    divisors += ",";
                }

            }
        }

       
        if (isPrime) {
            System.out.println("prime");

        } else if (!isPrime) {
            System.out.println("not prime. It can be divided by " + divisors);
            System.out.println();
        } 

    }
    

}
