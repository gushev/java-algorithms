package unionfind.algorithms;

public class QuickUnion implements UnionFind {
  private final int[] elements;

  public QuickUnion(int numberOfElements) {
    elements = new int[numberOfElements];

    for (int i = 0; i < numberOfElements; i++) {
      elements[i] = i;
    }
  }

  @Override
  public boolean connected(int p, int q) {
    return getRoot(p) == getRoot(q);
  }

  @Override
  public void union(int p, int q) {
    int firstGroupRoot = getRoot(p);
    int secondGroupRoot = getRoot(q);
    elements[firstGroupRoot] = secondGroupRoot;
  }

  private int getRoot(int element) {
    while (element != elements[element]) {
      element = elements[element];
    }

    return element;
  }

  @Override
  public int getElementCount() {
    return elements.length;
  }

  @Override
  public void displayElements() {
    System.out.print("elements: ");
    for (int i = 0; i < elements.length; i++) {
      System.out.print("\t" + i);
    }

    System.out.print("\ngroups: ");
    for (int element : elements) {
      System.out.print("\t" + element);
    }

    System.out.println();
  }
}
