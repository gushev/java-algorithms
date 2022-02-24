package search.binarysearch;

public class Main {
  public static void main(String[] args) {
    Integer index = BinarySearch.search(new int[]{1, 2, 5, 7, 11, 24, 166}, 7);
    System.out.println(index);
  }
}
