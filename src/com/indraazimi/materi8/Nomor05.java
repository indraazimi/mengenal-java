package com.indraazimi.materi8;

import java.util.Scanner;

/**
 * Dengan mengenal konsep array, sekarang kita juga dapat
 * meminta data dari pengguna dalam jumlah yang fleksibel.
 * Coding berikut akan meminta n data dari pengguna, lalu
 * menghitung jumlah angka-angka tersebut dan menampilkannya.
 */
public class Nomor05 {

    public static void main(String[] args) {
        // Pertama, tanyakan ke pengguna, ada berapa data?
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Lalu alokasikan sebuah array nilai sebanyak n
        // untuk menampung n buah data nilai dari pengguna
        int[] nilai = new int[n];

        // Terakhir, isi array nilai dengan input pengguna
        for (int i = 0; i < n; i++) {
            nilai[i] = scanner.nextInt();
        }

        int jumlah = 0;
        for (int value : nilai) {
            jumlah = jumlah + value;
        }
        System.out.println(jumlah);
    }
}
