import java.util.Scanner;

public class MultiplicationTable {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      multiplicationTable(scanner);
      restart = HelperMethods.getRestart(scanner, "Multiplication Table");
    }
  }

  public static void multiplicationTable(Scanner inputScanner) {
    Integer chosenNumber = HelperMethods.receiveNumber(
        inputScanner,
        "Multiplication Table");

    if (chosenNumber != null) {
      System.out.println(
          "\n\nHere is your multiplication table for the number " +
              chosenNumber +
              "\n");

      for (int i = 1; i <= 10; i++) {
        int result = i * chosenNumber;
        System.out.print(chosenNumber + "x" + i + "=" + result);
        if (i <= 9 && i != 5) {
          System.out.print(" | ");
        }
      }
    } else {
      System.out.println("Invalid input. Please enter a valid number.");
    }
  }

}
