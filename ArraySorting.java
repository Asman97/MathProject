import java.util.Scanner;

public class ArraySorting {

    public static void thirdProg(Scanner scanner) {

        System.out.println("Enter the number of elements in the array: ");
        int numOfElements = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        // array is a reference, all are same array.
        int[] array = new int[numOfElements];

        
        

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        bubbleSortAlgorithm(array);

        System.out.println("Sorted array:");
        String arrayAsInt = String.format("%d", array);
        String[] splittedArray = arrayAsInt.split(", ");
        for (String myStr: splittedArray) {
            System.out.print(myStr);
        }

    }

    static void bubbleSortAlgorithm(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int tempVarToSwap = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tempVarToSwap;
                }
            }
        }
    }
    // theres no need to return since we're working on the same array

}
