package com.lizs.pattern.singleton;

public class LazySingletonThreadSafe {
    private static LazySingletonThreadSafe instance;

    private LazySingletonThreadSafe() {
    }

    public static LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new LazySingletonThreadSafe();
                }
                return instance;
            }
        }
        return instance;
    }
}
