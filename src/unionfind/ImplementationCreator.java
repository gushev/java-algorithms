package unionfind;

import unionfind.algorithms.UnionFind;

import java.lang.reflect.InvocationTargetException;

public class ImplementationCreator {
  public static <T extends UnionFind> T create(Class<T> className, int numberOfElements) {

    try {
      return className.getConstructor(int.class).newInstance(numberOfElements);
    } catch (NoSuchMethodException
        | IllegalAccessException
        | InstantiationException
        | InvocationTargetException e) {
      throw new RuntimeException("Error creating an instance");
    }
  }
}
