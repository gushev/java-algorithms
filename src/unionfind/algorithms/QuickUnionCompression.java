package unionfind.algorithms;

public class QuickUnionCompression extends QuickUnionWeighted implements UnionFind {

  public QuickUnionCompression(int numberOfElements) {
    super(numberOfElements);
  }

  private int getRoot(int element) {
    while (element != elements[element]) {
      element = elements[element];
      elements[element] = elements[elements[element]];
    }

    return element;
  }
}
