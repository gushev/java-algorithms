package datastructures.linkedlist;

public class LinkedList<T> {
  private Node<T> head;

  public void add(T value) {
    Node<T> last = getLast();

    if(last == null) {
      head = new Node<>(value);
    } else {
      last.setNext(new Node<>(value));
    }
  }

  public T removeLast() {

    if (head == null) {
      return null;
    }

    if (head.getNext() == null) {
      T returnData = head.getData();
      head = null;
      return returnData;
    }

    Node<T> current = head;
    Node<T> next;

    while (true) {
      next = current.getNext();

      if (next.getNext() == null) {
        current.setNext(null);
        return next.getData();
      }

      current = next;
    }
  }

  public void printList() {
    if (head == null) {
      return;
    }

    Node<T> current = head;

    while(current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
  }

  private Node<T> getLast() {

    if (head == null) {
      return null;
    }

    Node<T> current = head.getNext();

    while (current != null) {
      if (current.getNext() == null) {
        return current;
      }
      current = current.getNext();
    }

    return head;
  }
}
