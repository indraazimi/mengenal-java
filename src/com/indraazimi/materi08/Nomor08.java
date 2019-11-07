package com.indraazimi.materi08;

/**
 * Contoh lain dari nested loop. Ingat sekali lagi, bahwa pada
 * nested loop, loop pertama (i) tidak akan lanjut ke iterasi
 * selanjutnya sebelum loop kedua (j) selesai dieksekusi.
 *
 * Coba perkirakan, berapakah output dari program ini?
 */
public class Nomor08 {

    public static void main(String[] args) {
        int n = 5;
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                total = total + j;
            }
            total = total + i;
        }
        System.out.println(total);
    }
}
