package search.binarysearch;

public class BinarySearch {
  public static Integer search(int[] input, int target) {

    int left = 0;
    int right = input.length - 1;
    int mid = calculateMid(left, right);

    while(true) {
      if(input[mid] == target) {
        return mid;
      }

      if(input[mid] > target) {
        right = mid - 1;
      }

      if (input[mid] < target) {
        left = mid + 1;
      }

      mid = calculateMid(left, right);
    }
  }

  private static int calculateMid(int left, int right) {
    return (left + right) / 2;
  }
}
