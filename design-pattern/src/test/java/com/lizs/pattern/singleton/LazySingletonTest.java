package com.lizs.pattern.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

public class LazySingletonTest {

    private static final int THREAD_COUNT = 502;

    @Test
    public void getInstance() {
        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(
                    () -> {
                        try {
                            latch.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(LazySingleton.getInstance());
                    }).start();
            latch.countDown();
        }
    }

    @Test
    public void getInstanceByReflect() {
        try {
            Constructor constructor = LazySingletonThreadSafe.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazySingletonThreadSafe instance = (LazySingletonThreadSafe) constructor.newInstance();
            System.out.println("instance from reflect: " + instance);
            System.out.println("instance from method: " + LazySingletonThreadSafe.getInstance());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
