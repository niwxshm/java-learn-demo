package com.lizs.pattern.singleton;

public class HungrySingleton {
  private static HungrySingleton instance = new HungrySingleton();

  public static HungrySingleton getInstance() {
    return instance;
  }
}
