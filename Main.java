import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String args[]) {
        boolean runMainAction = true;
        scanner = new Scanner(System.in);

        while (runMainAction) {
            runMainAction = mainAction(scanner);
        }
    }

    private static boolean mainAction(Scanner scanner) {

        System.out.println();
        System.out.println("\n" + "\n" + "\n" + "Enter the number to select an option:");

        String lineA = "1. Multiplication table.";
        String lineB = "2. Prime Number Checker.";
        String lineC = "3. Fibonacci Series.";
        String lineD = "4. Guess the Number Game.";
        String lineE = "5. Palindrome Checker";
        String lineF = "6. String Reversal ";
        String lineG = "7. Array Sorting";
        String lineH = "8. Array Manipulation.";
        String lineK = "To quit, enter 'q'";

        System.out.println("\n" + lineA + "\n" + "\n" + lineB + "\n" + "\n" + lineC + "\n" + "\n" + lineD + "\n"
                + "\n" + lineE + "\n" + "\n" + lineF + "\n" + "\n" + lineG + "\n" + "\n" + lineH + "\n" + "\n" + lineK
                + "\n" + "\n");

        String input = scanner.next();
        if (input.equalsIgnoreCase("q")) {
            return false;
        } else if (!input.matches("[1-8]+")) {
            System.out.println("\n'" + input + "' is not a valid input");
        } else {
            int choice = Integer.parseInt(input);
            if (choice < 1 || choice > 8) {
                System.out.println("\n'" + choice + "' is not a valid input");
            } else {
                switch (choice) {
                    case 1:
                        MultiplicationTable.run(scanner);
                        break;
                    case 2:
                        PrimeNumberChecker.run(scanner);
                        break;
                    case 3:
                        FibonacciSeries.run(scanner);
                        break;
                    case 4:
                        GuessTheNumber.run(scanner);
                        break;
                    case 5:
                        PalindromeChecker.run(scanner);
                        break;
                    case 6:
                        StringReversal.run(scanner);
                        break;
                    case 7:
                        ArraySorting.run(scanner);
                        break;
                    case 8:
                        ArrayManipulation.run(scanner);
                        break;
                    default:
                        break;
                }
            }
        }

        return true;

    }

}
