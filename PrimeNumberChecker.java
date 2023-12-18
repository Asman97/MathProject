import java.util.Scanner;

public class PrimeNumberChecker {

    public static void run2(Scanner scanner){
        System.out.println();
        System.out.println("Which number do you want to check?");
        System.out.println();
        Integer numToCheck = scanner.nextInt();
        Integer diviser = 0;
        for(int i =1; i <= numToCheck; i++){
            if (numToCheck % i == 0){
                diviser++;
            }
        }

        if(diviser == 2) {
            System.out.println("prime");;
        }else{
            System.out.println("not prime");
            System.out.println();
        }
    }
    
}
