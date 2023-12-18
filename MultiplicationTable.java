import java.util.Scanner;

public class MultiplicationTable {
  public static void run(Scanner scanner) {

    System.out.println("Which number would you like the multiplication Table for");
    Integer chosenNumber = scanner.nextInt(); // Read user input

    System.out.println("Here is your multiplication table for the number" + " " + chosenNumber);

    if (chosenNumber < 1 || chosenNumber > 100) {
      System.out.println("Number is not between 1 and 100.");

    } else {
      for (int i = 1; i <= 10; i++) {

        int result = i * chosenNumber;
        System.out.println(chosenNumber + "x" + i + "=" + result);

      }
    }

  }

}
