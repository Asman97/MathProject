import java.util.Scanner;

public class StringReversal {

    public static void run(Scanner scanner) {
        boolean restart = true;
        while (restart) {
            resultStringReversal(getReversal(scanner));
            restart = HelperMethods.getRestart(scanner, "String Reversal");
        }
    }

    public static String getReversal(Scanner getInput) {
        System.out.print("\n\nWhich String would you like to revers? : ");
        return HelperMethods.getWord(getInput);
    }

    public static void resultStringReversal(String getInput) {
        String input = getInput;
        String reversedStr = "";
        char ch;

        System.out.println("\n" + "Original word is: " + input);

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            reversedStr = ch + reversedStr;
        }
        System.out.println("\nReversed word is: " + reversedStr);
    }

}
