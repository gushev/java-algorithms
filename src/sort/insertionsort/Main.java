package sort.insertionsort;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 4, 6, 1, 3};

    InsertionSort insertionSort = new InsertionSort(numbers);

    insertionSort.sort();
  }
}
