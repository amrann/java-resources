package org.dicoding.basic.controlflow;

public class Perulangan {
  public static void main(String[] args) {
//        forBersarang();
    wail();
  }

  public static void forBersarang() {
    int a = 5;
    for (int i = 0; i <= a; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void wail() {
    int value = 1;
    while (value <= 10) {
      System.out.print("Angka : " + value);
      value++;
      System.out.print("\n");
    }
  }
}
