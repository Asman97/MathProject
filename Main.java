import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        boolean restart;
        do {
            mainAction();
            restart = Continue();
        } while (restart);

    }

    private static boolean Continue() {

        // return scanner.hasNext();
        return true;

    }

    private static void mainAction() throws Exception {

        try {
            System.out.println();
            System.out.println("\n" + "Enter the number to select an option:");

            String lineA = "1. Multiplication table.";
            String lineB = "2. Prime Number Checker.";
            String lineC = "3. Fibonacci Series.";
            String lineD = "4. Guess the Number Game.";
            String lineE = "To quit, enter 'q'";

            System.out.println("\n" + lineA + "\n" + "\n" + lineB + "\n" + "\n" + lineC + "\n" + "\n" + lineD + "\n"
                    + "\n" + lineE + "\n" + "\n");

            String input = scanner.next();
            System.out.println("\n" + "You chose " + input);
            if (input.equals("1")) {
                MultiplicationTable.run(scanner);

            } else if (input.equals("2")) {
                PrimeNumberChecker.run2(scanner);
            } else if (input.equals("3")) {
                fibonacciSequence.run3(scanner);
            } else if (input.equals("4")) {
                GuessTheNumber.run4(scanner);
            } else if (input.equals("q")) {
                quitCommand.run5(scanner);
            } else {
                System.out.println("Your input is invalid!");
            }

        }

        catch (Exception e) {
            System.out.println("An error occured:");;
            System.out.println(e);
        }

    }

}
