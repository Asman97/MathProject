import java.util.Scanner;

public class ArraySorting {

    public static int[] thirdProg(Scanner scanner) {

        System.out.print("Enter elements with a ',' in between: ");
        String numbers = scanner.next();
        String[] numberArray = numbers.split(",");
        int[] intArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            intArray[i] = Integer.parseInt(numberArray[i]);
        }

        for (int k = 0; k < intArray.length; k++) {
            boolean rememberSwap = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int tempVarToSwap = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempVarToSwap;
                }
            }
            if (!rememberSwap) {
              break;
            }
        }
        return intArray;
    }

    public static void output(int[] intArray) {
        System.out.print("Soted Array: ");
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.print(intArray[intArray.length - 1]);
    }
}
