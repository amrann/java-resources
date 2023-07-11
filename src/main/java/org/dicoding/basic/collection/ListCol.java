package org.dicoding.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCol {
    public static void main(String[] args) {
      // deklarasi array
      String[] heroes = new String[2];
      heroes[0] = "riki";
      heroes[1] = "amran";

      //menggunakan arraylist
      List<String> planets = new ArrayList<>();
      planets.add("mercury");
      planets.add("venus");
      planets.add("bumi");
      planets.add("mars");

      System.out.println("List planets awal:");
      // method size() untuk mendapatkan ukuran List
      for (int i = 0; i < planets.size(); i++) {
        // method get() untuk melihat isi List pada index i
        System.out.println("\t index-"+ i +" = " + planets.get(i));
      }

      planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List

      System.out.println("List planets akhir:");
      for (int i = 0; i < planets.size(); i++) {
        System.out.println("\t index-"+ i +" = " + planets.get(i));
      }
    }
}
