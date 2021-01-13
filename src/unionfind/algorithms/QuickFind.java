package unionfind.algorithms;

public class QuickFind implements UnionFind {
  private final int[] elements;

  public QuickFind(int numberOfElements) {
    elements = new int[numberOfElements];

    for (int i = 0; i < numberOfElements; i++) {
      elements[i] = i;
    }
  }

  @Override
  public boolean connected(int p, int q) {
    return elements[p] == elements[q];
  }

  @Override
  public void union(int p, int q) {
    int firstGroup = elements[p];
    int secondGroup = elements[q];

    for (int i = 0; i < elements.length; i++) {
      if (elements[i] == firstGroup) {
        elements[i] = secondGroup;
      }
    }
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
