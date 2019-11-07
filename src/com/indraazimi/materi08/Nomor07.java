package com.indraazimi.materi08;

/**
 * Sama seperti if, for loop juga dapat dituliskan nested. Pada
 * nested loop, loop pertama (i) tidak akan lanjut ke iterasi
 * selanjutnya sebelum loop kedua (j) selesai dieksekusi.
 */
public class Nomor07 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
