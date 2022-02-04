package sort.selectionsort;

public class SelectionSort {
  public static int[] sort (int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int biggestElementIndex = findBiggestElementIndex(arr, i);
      int lastUnsortedElementIndex = arr.length - 1 - i;
      int lastUnsortedElementValue = arr[lastUnsortedElementIndex];

      arr[lastUnsortedElementIndex] = arr[biggestElementIndex];
      arr[biggestElementIndex] = lastUnsortedElementValue;
    }

    return arr;
  }

  private static int findBiggestElementIndex(int[] arr, int sortedElements) {
    int biggestElementIndex = 0;
    for (int i = 0; i < arr.length - sortedElements; i++) {
      if (arr[biggestElementIndex] < arr[i]) {
        biggestElementIndex = i;
      }
    }

    return biggestElementIndex;
  }
}
