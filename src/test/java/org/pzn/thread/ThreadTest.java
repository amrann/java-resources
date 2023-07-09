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


  @Test
  void threadJoin() throws InterruptedException {
    Runnable runnable = () -> {
      try {
        Thread.sleep(2_000L);
        System.out.println("Halo java thread : " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();
    System.out.println("Menunggu selesai");
    thread.join(); // dengan "join ini", program menunggu proses sleepnya selesai
    System.out.println("Program selesai");
  }
//  output :
//  Menunggu selesai
//  Halo java thread : Thread-1
//  Program selesai

  @Test
  void threadName() {
    Thread thread = new Thread(() -> {
      System.out.println("Run in thread : " + Thread.currentThread().getName());
    });
    thread.setName("Meran");
    thread.start();
  }
}
