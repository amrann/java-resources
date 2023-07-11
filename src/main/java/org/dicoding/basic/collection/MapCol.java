package org.dicoding.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCol {
  public static void main(String[] args) {
    Map<String, Planet> planetMap = new HashMap<>();
    planetMap.put("key-1", new Planet("Mercury", 0.06));
    planetMap.put("key-2", new Planet("Venus", 0.82));
    planetMap.put("key-3", new Planet("Earth", 1.00));
    planetMap.put("key-4", new Planet("Mars", 0.11));
    planetMap.put("key-4", new Planet("Mars-X", 0.51)); // menambahkan ke Map dengan key yang sama

    // method size() untuk mendapatkan ukuran Set
    System.out.println("Map planets awal: (size = "+ planetMap.size() +")");
    for (String key : planetMap.keySet()) { // looping key dari Map
      // method get() untuk melihat isi Map berdasarkan key
      System.out.println("\t " + key + " : " + planetMap.get(key));
    }

    planetMap.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map

    System.out.println("Map planets akhir: (size = "+ planetMap.size() +")");
    for (Planet planet : planetMap.values()) { // looping value dari Map
      System.out.println("\t " + planet);
    }
  }
}
