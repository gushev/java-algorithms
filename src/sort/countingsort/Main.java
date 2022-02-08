package sort.countingsort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = new int[] {-10, 5, 1, 7, 7, 3, 2, 6, 7, 157, 36, -45, -52, -5};
    System.out.println(Arrays.toString(CountingSort.sort(array)));
  }
}
