package datastructures.heap;

import datastructures.heap.implementation.Heap;
import datastructures.heap.implementation.MaxHeap;

public class Main {
  public static void main(String[] args) {
    Heap maxHeap = new MaxHeap();
    maxHeap.insert(1);
    maxHeap.insert(2);
    maxHeap.insert(3);
    maxHeap.insert(4);
    maxHeap.insert(5);
    System.out.println(maxHeap);
  }
}
