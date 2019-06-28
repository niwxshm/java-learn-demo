package com.lizs.pattern.singleton;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

public class InnerClassSingletonTest {

  @Test
  public void getInstance() {

    CountDownLatch latch = new CountDownLatch(5);
    for (int i = 0; i < 5; i++) {
      new Thread() {
        @Override
        public void run() {
          try {
            latch.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(InnerClassSingleton.getInstance());
        }
      }.start();
      latch.countDown();
    }
  }
}
