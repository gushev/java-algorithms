package sorting.insertionsort;

public class InsertionSort {
  public int[] sort(int[] inputArray) {

    for (int i = 1; i < inputArray.length; i++) { // starting the iteration from the second element

      int curr = inputArray[i]; // taking the current iteration element
      int prevKey = i - 1; // taking the previous key

      // loop while previous key is higher than 0 and its value is higher than the current value
      while (prevKey >= 0 && inputArray[prevKey] > curr) {
        inputArray[prevKey + 1] = inputArray[prevKey]; // move the previous key value to the right
        prevKey -= 1; // decrement the previous key with one, so we can go one element to the left
      }

      // move the current element to the right of where the element that
      // we've identified as smaller in the while loop
      inputArray[prevKey + 1] = curr;
    }

    return inputArray;
  }
}
