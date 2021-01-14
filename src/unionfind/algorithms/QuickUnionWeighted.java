package unionfind.algorithms;

public class QuickUnionWeighted implements UnionFind {
  protected final int[] size;
  protected final int[] elements;

  public QuickUnionWeighted(int numberOfElements) {
    size = new int[numberOfElements];
    elements = new int[numberOfElements];

    for (int i = 0; i < numberOfElements; i++) {
      size[i] = 1;
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

    if(firstGroupRoot == secondGroupRoot) {
      return;
    }

    if (size[firstGroupRoot] > size[secondGroupRoot]) {
      elements[secondGroupRoot] = firstGroupRoot;
      size[firstGroupRoot] += size[secondGroupRoot];
    } else {
      elements[firstGroupRoot] = secondGroupRoot;
      size[secondGroupRoot] += size[firstGroupRoot];
    }
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
    System.out.print("elems: ");
    for (int i = 0; i < elements.length; i++) {
      System.out.print("\t" + i);
    }

    System.out.print("\ngrps: ");
    for (int element : elements) {
      System.out.print("\t" + element);
    }

    System.out.print("\nsizes: ");
    for (int element : size) {
      System.out.print("\t" + element);
    }

    System.out.println();
  }
}
