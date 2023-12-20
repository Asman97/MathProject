import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        
        do {
            mainAction();
            
        } while (true);

        
    }
   


    private static boolean mainAction() throws Exception {

        try {
            System.out.println();
            System.out.println("\n" + "Enter the number to select an option:");

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
                    + "\n" + lineE + "\n" + "\n" + lineF +"\n" + "\n"+ lineG + "\n" + "\n" + lineH + "\n" + "\n" + lineK + "\n" + "\n");

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
            } 
            else if (input.equals("5")) {
                PalindromeChecker.firstProg(scanner);
    
            } else if (input.equals("6")) {
                StringReversal.secondProg(scanner);
            } else if (input.equals("7")) {
                ArraySorting.thirdProg(scanner);
            } else if (input.equals("8")) {
                ArrayManipulation.fourthProg(scanner);
            }
            else if (input.equals("q")) {
                quitCommand.run5(scanner);
                return true;
            } 
            else {
                System.out.println("Your input is invalid!");
            }

        }

        catch (Exception e) {
            System.out.println("An error occured:");;
            System.out.println(e);
        }
        return false;

    }

}
