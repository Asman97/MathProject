import java.util.Scanner;

public class PalindromeChecker {
    public static void firstProg(Scanner scanner){
        System.out.println("Which word would you like to check?");
        
        String chosenWord= scanner.nextLine();
        
        if (chosenWord.equals(chosenWord)){
            System.out.println("This is a palindrome :)");

        }
    }
}
