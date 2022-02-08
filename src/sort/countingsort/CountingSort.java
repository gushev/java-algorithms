package sort.countingsort;

import java.util.Arrays;

public class CountingSort {
  public static int[] sort(int[] input) {

    int max = Arrays.stream(input).max().getAsInt();
    int min = Arrays.stream(input).min().getAsInt();
    int range = max - min + 1;
    int[] count = new int[range];
    int[] output = new int[input.length];

    for (int i = 0; i < input.length; i++) {
      count[input[i] - min]++;
    }

    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }

    for (int i = input.length - 1; i >= 0; i--) {
      output[count[input[i] - min] - 1] = input[i];
      count[input[i] - min]--;
    }

    return output;
  }
}
