package datastructures.heap.implementation;

public class MinHeap extends Heap {

  public int deleteMin() {
    return deleteFirst();
  }

  @Override
  protected void heapifyUp(int i) {
    if (node(i) < parent(i)) {
      int parentValue = parent(i);
      elements.set(parentIndex(i), node(i));
      elements.set(i, parentValue);
      if (parentIndex(i) > 0) {
        heapifyUp(parentIndex(i));
      }
    }
  }

  @Override
  protected void heapifyDown(int i) {
    int nodeValue = node(i);
    if (left(i) < right(i) && left(i) < node(i)) {
      elements.set(i, left(i));
      elements.set(leftIndex(i), nodeValue);
      heapifyDown(leftIndex(i));
    } else if (right(i) < node(i)) {
      elements.set(i, right(i));
      elements.set(rightIndex(i), nodeValue);
      heapifyDown(rightIndex(i));
    }
  }

  @Override
  protected int heapifyInt() {
    return Integer.MAX_VALUE;
  }
}
