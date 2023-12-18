import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean restart = true;
        do {
            mainAction();
            restart = Continue();
        } while (restart);

    }

    private static boolean Continue() {

        // return scanner.hasNext();
        return true;

    }

    private static void mainAction() {

        try {
        System.out.println();   
        System.out.println("Which program do you need?");

        String lineA = "For Multiplication table, enter 1";
        String lineB = "For Prime Number Checker, enter 2";
        String lineC = "For Fibonacci Series, enter 3";
        String lineD = "For Guess the Number Game, enter 4";
        String lineE = "To quit, enter 'q'";
       
        System.out.println(lineA + "\n" + lineB + "\n" + lineC + "\n" + lineD + "\n" + lineE + "\n");

        String input = scanner.next();
        System.out.println("You chose " + input);
        if (input.equals("1")) {
            MultiplicationTable.run(scanner);

        }
        else if (input.equals("2")) {
            PrimeNumberChecker.run2(scanner);
        }
        else if(input.equals("3")){
            fibonacciSequence.run3(scanner);
        }
        else if(input.equals("4")){
            GuessTheNumber.run4(scanner);
        }
        else if(input.equals("q")){
            quitCommand.run5(scanner);
        }
    }
       catch (Exception e) {
            System.out.println("Please choose one of the given choices!");
        }

    }

}
