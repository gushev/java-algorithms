package unionfind;

import unionfind.algorithms.UnionFind;

import java.util.Random;

public class Unifier {
  private final UnionFind algorithm;
  private final Random random = new Random();

  public Unifier(UnionFind algorithm) {
    this.algorithm = algorithm;
  }

  public void makeRandomUnions(int count) {
    for (int i = 0; i < count; i++) {
      int first = getRandomElement();
      int second =  getRandomElement();
      System.out.printf("Union created between: %d and %d%n", first, second);
      algorithm.union(first, second);
    }
  }

  private int getRandomElement() {
    return random.nextInt(algorithm.getElementCount() - 1);
  }
}
