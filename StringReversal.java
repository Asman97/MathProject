import java.util.Scanner;

public class StringReversal {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      reversingString(getUserInput(scanner));
      restart = HelperMethods.getRestart(scanner, "String Reversal");
    }
  }

  private static String getUserInput(Scanner getInput) {
    System.out.print("\n\nWhich String would you like to revers? : ");
    return HelperMethods.getWord(getInput);
  }

  public static void reversingString(String getInput) {
    String reversedStr = "";
    System.out.println("\n" + "Original word is: " + getInput);

    for (int i = 0; i < getInput.length(); i++) {
      char ch = getInput.charAt(i);
      reversedStr = ch + reversedStr;
    }
    System.out.println("\nReversed word is: " + reversedStr);
  }
}
