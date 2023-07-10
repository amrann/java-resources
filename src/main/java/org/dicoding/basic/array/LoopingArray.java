package org.dicoding.basic.array;

public class LoopingArray {
  public static void main(String[] args) {
    int[] arrInt = new int[20];

    // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 20
    for (int x = 0; x < arrInt.length; x++) {
      arrInt[x] = x + 1;
      System.out.println(arrInt[x]);
    }
  }
}
