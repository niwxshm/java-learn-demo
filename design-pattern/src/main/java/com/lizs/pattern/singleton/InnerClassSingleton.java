package com.lizs.pattern.singleton;

public class InnerClassSingleton {
  private static boolean initialized;

  private InnerClassSingleton() {
    synchronized (InnerClassSingleton.class) {
      if (initialized) {
        throw new RuntimeException("非法创建InnerClassSingleton对象");
      } else {
        initialized = true;
      }
    }
  }

  public static InnerClassSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

  private static class SingletonHolder {
    private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
  }
}
