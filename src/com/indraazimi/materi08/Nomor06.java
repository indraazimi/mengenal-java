package com.indraazimi.materi08;

import java.util.Scanner;

/**
 * Contoh lain penggunaan array. Di sini kita meminta n data
 * dari pengguna kemudian menampilkan angka yang terbesar.
 */
public class Nomor06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            nilai[i] = scanner.nextInt();
        }

        int max = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println(max);
    }
}
