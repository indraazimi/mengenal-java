package com.indraazimi.materi09;

import java.util.Scanner;

/**
 * Program {@link Nomor04} berjalan benar, namun masih kurang
 * efisien, karena ada cara yang lebih baik. Yaitu bandingkan
 * huruf pertama dengan huruf terakhir, huruf kedua dengan huruf
 * kedua terakhir, dst. Sehingga di sini kita akan melakukan
 * perulangan MAKSIMAL sebanyak setengah dari panjang kalimat.
 */
public class Nomor05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
        String hasil = "PALINDROME";
        int maks = nama.length() / 2;
        for (int i = 0; i < maks; i++) {
            if (nama.charAt(i) != nama.charAt(nama.length()-i-1)) {
                hasil = "BUKAN";
                break;
            }
        }
        System.out.println(hasil);
    }
}
