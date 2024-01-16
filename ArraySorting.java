import java.util.Scanner;

public class ArraySorting {

  public static void run(Scanner scanner) {
    boolean restart = true;
    while (restart) {
      int[] intArray = sortingTheArray(scanner);
      SortedArray(intArray);
      restart = HelperMethods.getRestart(scanner, "Array sorting");
    }
  }

  private static int[] sortingTheArray(Scanner scanner) {
    System.out.print("\n\nEnter Elements with a ',' in between: ");
    String numbers = scanner.next();
    String[] numberArray = numbers.split(",");
    int[] intArray = new int[numberArray.length];
    for (int i = 0; i < numberArray.length; i++) {
      intArray[i] = Integer.parseInt(numberArray[i]);
    }

    for (int l = 0; l < intArray.length; l++) {
      boolean hasSwapped = false;
      for (int i = 0; i < intArray.length - 1; i++) {
        if (intArray[i] > intArray[i + 1]) {
          int temp = intArray[i];
          intArray[i] = intArray[i + 1];
          intArray[i + 1] = temp;
          hasSwapped = true;
        }
      }
      if (!hasSwapped) {
        break;
      }
    }
    return intArray;
  }

  private static void SortedArray(int[] intArray) {
    System.out.print("\nSorted Array : ");
    for (int i = 0; i < intArray.length - 1; i++) {
      System.out.print(intArray[i] + ", ");
    }
    System.out.print(intArray[intArray.length - 1] + "\n");
  }
}
