package datastructures.linkedlist;

public class Node<T> {

  public Node(T data) {
    this.data = data;
  }

  private final T data;
  private Node<T> next;

  public T getData() {
    return data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }
}
