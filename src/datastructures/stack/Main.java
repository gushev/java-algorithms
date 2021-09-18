package datastructures.stack;

public class Main {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(2);
    stack.push(5);
    stack.push(55);
    stack.printStack();
    stack.pop();
    stack.printStack();
    stack.pop();
    stack.printStack();
  }
}
