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
