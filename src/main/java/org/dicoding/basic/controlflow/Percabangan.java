package org.dicoding.basic.controlflow;

public class Percabangan {
  public static void main(String[] args) {
//        ifElseIf();
    switchCase();
  }

  public static void ifElseIf() {
    int nilaiUjian = 80;
    char indeksPrestasi;

    if (nilaiUjian >= 90) {
      indeksPrestasi = 'A';
    } else if (nilaiUjian >= 80) {
      indeksPrestasi = 'B';
    } else if (nilaiUjian >= 70) {
      indeksPrestasi = 'C';
    } else if (nilaiUjian >= 60) {
      indeksPrestasi = 'D';
    } else if (nilaiUjian >= 50) {
      indeksPrestasi = 'E';
    } else {
      indeksPrestasi = 'F';
    }
    System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
  }

  public static void switchCase() {
    int input = 3;
    switch (input) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;
      case 5:
        System.out.println("5");
        break;
      default:
        break;
    }
  }
}
