package sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

  private int[] inputArray;

  public InsertionSort(int[] inputArray) {
    this.inputArray = inputArray;
  }

  public int[] sort() {

    System.out.printf("Initial array: %s%n", Arrays.toString(inputArray));

    for (int i = 1; i < inputArray.length; i++) { // starting the iteration from the second element

      int curr = inputArray[i]; // taking the current iteration element
      int prevKey = i - 1; // taking the previous key

      // loop while previous key is higher than 0 and its value is higher than the current value
      while (prevKey >= 0 && inputArray[prevKey] > curr) {
        printChange(prevKey);
        inputArray[prevKey + 1] = inputArray[prevKey]; // move the previous key value to the right
        inputArray[prevKey] = curr; // move current value element to the left
        prevKey -= 1; // decrement the previous key with one, so we can go one element to the left
      }
    }

    System.out.printf("Output array: %s%n", Arrays.toString(inputArray));
    return inputArray;
  }

  private void printChange(int prevKey) {
    StringBuilder change = new StringBuilder("[");

    for (int i = 0; i < inputArray.length; i++) {
      change.append(inputArray[i]);
      if (prevKey == i) {
        change.append(" <-> ");
      } else if (i < inputArray.length - 1) {
        change.append(", ");
      }
    }

    change.append("]");

    System.out.println(change);
  }
}
