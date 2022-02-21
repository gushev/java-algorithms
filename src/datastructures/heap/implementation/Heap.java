package datastructures.heap.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Heap {

  protected List<Integer> elements = new ArrayList<>();

  public Heap() {
    super();
  }

  public Heap(List<Integer> elements) {
    this.elements = elements;
    heapify();
  }

  public Heap(int[] elements) {
    Arrays.stream(elements).forEach(this::insert);
  }

  public void insert(int element) {
    elements.add(element);
    heapifyUp(elements.size() - 1);
  }

  public int node(int i) {
    return elements.get(i);
  }

  public int left(int i) {
    return elements.get(leftIndex(i));
  }

  public int right(int i) {
    return elements.get(rightIndex(i));
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

  protected abstract void heapify();

  protected abstract void heapifyUp(int i);

  protected abstract void heapifyDown();
}
