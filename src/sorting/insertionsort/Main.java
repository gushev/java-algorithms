package sorting.insertionsort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 4, 6, 1, 3};

    InsertionSort insertionSort = new InsertionSort();

    System.out.println(Arrays.toString(insertionSort.sort(numbers)));
  }
}
