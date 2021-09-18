package datastructures.stack;

import datastructures.linkedlist.LinkedList;

public class Stack<T> {
  LinkedList<T> items = new LinkedList<>();

  public T push(T item) {
    items.add(item);

    return item;
  }

  public T pop() {
    return items.removeLast();
  }

  public void printStack() {
    System.out.println("Stack content:");
    items.printList();
  }
}
