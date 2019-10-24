package com.indraazimi.materi8;

/**
 * Coding kita di {@link Nomor03} dapat disederhanakan lagi dengan
 * menggunakan enhanced for loop, atau disebut juga for-each loop
 * seperti yang ada di baris ke-13.
 */
public class Nomor04 {

    public static void main(String[] args) {
        int[] nilai = { 45, 56, 67, 78, 89 };
        int jumlah = 0;
        for (int value : nilai) {
            jumlah = jumlah + value;
        }
        System.out.println(jumlah);
    }
}
