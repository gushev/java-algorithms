package datastructures.heap.implementation;

public class MaxHeap extends Heap {

  @Override
  protected void heapify() {

  }

  @Override
  protected void heapifyUp(int i) {
    if (node(i) > parent(i)) {
      int parentValue = parent(i);
      elements.set(parentIndex(i), node(i));
      elements.set(i, parentValue);
      if (parentIndex(i) > 0) {
        heapifyUp(parentIndex(i));
      }
    }
  }

  @Override
  protected void heapifyDown() {

  }
}
