package unionfind;

import unionfind.algorithms.*;

public class Main {
  public static void main(String[] args) {
    UnionFind algorithm = ImplementationCreator.create(QuickUnionCompression.class, 20);
    Unifier unifier = new Unifier(algorithm);
    unifier.makeRandomUnions(15);
    algorithm.displayElements();

    System.out.println(algorithm.connected(1, 10));
    System.out.println(algorithm.connected(5, 6));
    System.out.println(algorithm.connected(0, 3));
    System.out.println(algorithm.connected(3, 6));
  }
}
