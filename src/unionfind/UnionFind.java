package unionfind;

public interface UnionFind {
  boolean connected(int p, int q);
  void union(int p, int q);
  int getElementCount();
  void displayElements();
}
