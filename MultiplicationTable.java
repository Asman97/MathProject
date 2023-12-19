import java.util.Scanner;

public class MultiplicationTable {
  public static void run(Scanner scanner) {

    try {
      System.out.println("Which number would you like the multiplication Table for");
      Integer chosenNumber = getUserInput(scanner); // Read user input

      System.out.println("Here is your multiplication table for the number" + " " + chosenNumber);

      if (chosenNumber <= 10) {
        for (int i = 1; i <= 10; i++) {

          int result = i * chosenNumber;
          System.out.println(chosenNumber + "x" + i + "=" + result);

        }
      } else {
        System.out.println("Enter number from 1 to 10!");
      }
    }
    catch (Exception e) {
      System.out.println("An error occurred in MultiplicationTable");      
      System.out.println(e);

    }

  }

  private static int getUserInput(Scanner scanner){
    if(scanner.hasNextInt()){
      int input = scanner.nextInt();
      return input;
    }
    if (scanner.hasNext()) {
      scanner.next();
    }
    System.out.println("Your input was invalid, please enter a number:");
    return getUserInput(scanner);
  }

}
