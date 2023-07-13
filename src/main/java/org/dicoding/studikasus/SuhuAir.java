package org.dicoding.studikasus;

import java.util.Scanner;

public class SuhuAir {
  public static void main(String[] args) {
    int T;

    System.out.println("Contoh IF tiga kasus");
    System.out.print("Suhu (der. C) = ");

    // Scanner untuk inputan suhu air
    Scanner scan = new Scanner(System.in);
    T = scan.nextInt();

    // Proses pengecekan
    if(T < 0) {
      System.out.println("Wujud air beku " + T);
    } else if((T >= 0) && (T <= 100)) {
      System.out.println("Wujud air cair " + T);
    } else if(T > 100) {
      System.out.println("Wujud air uap/gas " + T);
    }
  }
}
