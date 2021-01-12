package unionfind.quickfind;

import unionfind.Unifier;

public class Main {
  public static void main(String[] args) {
    QuickFind qf = new QuickFind(20);
    Unifier unifier = new Unifier(qf);
    unifier.makeRandomUnions(12);
    qf.displayElements();

    System.out.println(qf.connected(1, 10));
    System.out.println(qf.connected(5, 6));
    System.out.println(qf.connected(0, 19));
    System.out.println(qf.connected(3, 18));
  }
}
