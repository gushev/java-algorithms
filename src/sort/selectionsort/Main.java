package sort.selectionsort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[] {5, 2, 6, 8, 3, 1, 3};

    System.out.println(Arrays.toString(SelectionSort.sort(arr)));
  }
}
