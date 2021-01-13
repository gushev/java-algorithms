package unionfind;

import unionfind.algorithms.QuickFind;
import unionfind.algorithms.QuickUnion;
import unionfind.algorithms.UnionFind;

public class Main {
  public static void main(String[] args) {
    UnionFind algorithm = ImplementationCreator.create(QuickUnion.class, 20);
    Unifier unifier = new Unifier(algorithm);
    unifier.makeRandomUnions(12);
    algorithm.displayElements();

    System.out.println(algorithm.connected(1, 10));
    System.out.println(algorithm.connected(5, 6));
    System.out.println(algorithm.connected(0, 19));
    System.out.println(algorithm.connected(3, 18));
  }
}
