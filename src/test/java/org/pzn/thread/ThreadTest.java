package org.pzn.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
  @Test
  void createSimpleThread() {
    Runnable runnable = () -> {
      System.out.println("Halo java thread : " + Thread.currentThread().getName());
    };

    Thread thread = new Thread(runnable);
    thread.start();

    System.out.println("Program selesai");
  }
  //  output :
  //  Program selesai
  //  Halo java thread : Thread-1
}
