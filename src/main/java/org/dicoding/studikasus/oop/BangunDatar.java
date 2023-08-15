package org.dicoding.studikasus.oop;

public interface BangunDatar {
    double luas(int s1, int s2);
    double keliling(int s1, int s2);

    default int totalSisi() {
        return 0;
    }

    default void keterangan(String name) {}
}
