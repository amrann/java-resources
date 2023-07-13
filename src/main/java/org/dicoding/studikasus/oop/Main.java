package org.dicoding.studikasus.oop;

import java.util.Scanner;

public class Main {

  private static char pilihan;
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    PersegiPanjang iniPersegi;
    Lingkaran iniLingkaran;
    SegitigaSiku iniSegitigaSiku;

    int s1, s2, r;

    iniLingkaran = new Lingkaran();
    iniPersegi = new PersegiPanjang();
    iniSegitigaSiku = new SegitigaSiku();

    mainMenu();

    switch (pilihan) {
      case '1': {
        System.out.print("Masukkan panjang persegi = ");
        s1 = scan.nextInt();
        System.out.print("Masukkan lebar persegi = ");
        s2 = scan.nextInt();
        System.out.println("Luar persegi panjang = " + iniPersegi.luas(s1, s2));
        System.out.println("Keliling persegi panjang = " + iniPersegi.keliling(s1, s2));
        break;
      }
      case '2': {
        System.out.print("Masukkan alas segitiga siku = ");
        s1 = scan.nextInt();
        System.out.print("Masukkan tinggi segitiga siku = ");
        s2 = scan.nextInt();
        System.out.println("Luas segitiga = " + iniSegitigaSiku.luas(s1, s2));
        System.out.print("Keliling segitiga = " + iniSegitigaSiku.keliling(s1, s2));
        break;
      }
      case '3': {
        System.out.print("Masukkan jari-jari lingkaran = ");
        r = scan.nextInt();
        System.out.println("Luas lingkaran = " + iniLingkaran.luas(r));
        System.out.println("Keliling lingkaran = " + iniLingkaran.keliling(r));
        break;
      }
      default: {
        System.out.println("Tidak ada pilihan");
        break;
      }
    }
  }

  public static void mainMenu() {
    System.out.println("==========================");
    System.out.println("Hitung Luas dan Keliling");
    System.out.println("1. Persegi Panjang");
    System.out.println("2. Segitiga Siku");
    System.out.println("3. Lingkaran");
    System.out.print("Masukan menu : ");
    pilihan = scan.next().charAt(0);
  }
}
