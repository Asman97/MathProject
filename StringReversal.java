import java.util.Scanner;

public class StringReversal {

    public static void secondProg(Scanner scanner) {

        System.out.println("Which string would you like to reverse?");
        String input = scanner.next();
        String reversedStr = "";
        char ch;

        System.out.println("\n" + "Original word is: " + input);
       

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i); 
            reversedStr = ch + reversedStr; 
        }
        System.out.println("Reversed word is: " + reversedStr);
    }

}
