package datastructures.heap.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Heap {

  protected List<Integer> elements = new ArrayList<>();

  public Heap() {
    super();
  }

  public Heap(int[] elements) {
    Arrays.stream(elements).forEach(this::insert);
  }

  public void insert(int element) {
    elements.add(element);
    heapifyUp(elements.size() - 1);
  }

  public int deleteFirst() {
    int first = elements.get(0);
    elements.set(0, elements.get(elements.size() - 1));
    heapifyDown(0);
    deleteLast();
    return first;
  }

  public int deleteLast() {
    int last = elements.get(elements.size() - 1);
    elements.remove(elements.size() - 1);
    return last;
  }

  public int node(int i) {
    return elements.get(i);
  }

  public int left(int i) {
    if (leftIndex(i) < elements.size()) {
      return elements.get(leftIndex(i));
    }
    return heapifyInt();
  }

  public Integer right(int i) {
    if (rightIndex(i) < elements.size()) {
      return elements.get(rightIndex(i));
    }
    return heapifyInt();
  }

  public int parent(int i) {
    return elements.get(parentIndex(i));
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    int depth = 0;

    for (int i = 0; i < elements.size(); i++) {
      if (depth(i) > depth) {
        stringBuilder.append("\n");
        depth++;
      }

      stringBuilder.append(elements.get(i));
    }

    return stringBuilder.toString();
  }

  protected int depth(int i) {
    int depth = 0;

    while (i != 0) {
      depth++;
      i = parentIndex(i);
    }

    return depth;
  }

  protected int leftIndex(int i) {
    return 2 * i + 1;
  }

  protected int rightIndex(int i) {
    return 2 * i + 2;
  }

  protected int parentIndex(int i) {
    return (i - 1) / 2;
  }

  protected abstract void heapifyUp(int i);

  protected abstract void heapifyDown(int i);

  protected abstract int heapifyInt();
}
