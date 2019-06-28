package com.lizs.pattern.singleton;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

public class HungrySingletonTest {
  private static final int THREAD_COUNT = 50;

  @Test
  public void getInstance() {

    CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
    for (int i = 0; i < THREAD_COUNT; i++) {
      new Thread() {
        @Override
        public void run() {
          try {
            latch.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(HungrySingleton.getInstance());
        }
      }.start();
      latch.countDown();
    }
  }
}
