package com.lizs.pattern.singleton;

import org.junit.Test;

import java.util.concurrent.*;

public class SingletonPerformanceTest {
  private static final int TASK_SIZE = 50;

  @Test
  public void Test() {
    ThreadPoolExecutor executor =
        new ThreadPoolExecutor(50, 100, 60, TimeUnit.MINUTES, new SynchronousQueue<Runnable>());
    innerClassSingletonTest(executor);
    lazySingletonTest(executor);
    lazySingletonThreadSafeTest(executor);
  }

  private void lazySingletonTest(ThreadPoolExecutor executor) {
    long start = System.currentTimeMillis();
    CountDownLatch latch = new CountDownLatch(TASK_SIZE);
    for (int i = 0; i < TASK_SIZE; i++) {
      executor.execute(
          () -> {
            LazySingleton.getInstance();
            latch.countDown();
          });
    }
    try {
      latch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long useTime = System.currentTimeMillis() - start;
    System.out.println("lazySingletonUseTime:" + useTime);
  }

  private void innerClassSingletonTest(ThreadPoolExecutor executor) {
    long start = System.currentTimeMillis();
    CountDownLatch latch = new CountDownLatch(TASK_SIZE);
    for (int i = 0; i < TASK_SIZE; i++) {
      executor.execute(
          () -> {
            LazySingleton.getInstance();
            latch.countDown();
          });
    }
    try {
      latch.await();
    } catch (Exception e) {
      e.printStackTrace();
    }

    long useTime = System.currentTimeMillis() - start;
    System.out.println("InnerClassSingletonUseTime:" + useTime);
  }

  private void lazySingletonThreadSafeTest(ThreadPoolExecutor executor) {
    long start = System.currentTimeMillis();
    CountDownLatch latch = new CountDownLatch(TASK_SIZE);
    for (int i = 0; i < TASK_SIZE; i++) {
      executor.execute(
          () -> {
              System.out.println(LazySingleton.getInstance());
              latch.countDown();
          });
    }
    try {
      latch.await();
    } catch (Exception e) {
      e.printStackTrace();
    }

    long useTime = System.currentTimeMillis() - start;
    System.out.println("lazySingletonThreadSafeTest:" + useTime);
  }
}
