package com.indraazimi.materi8;

import java.util.Scanner;

/**
 * Contoh program sederhana yang meminta dua buah matriks
 * dari pengguna, lalu menampilkan hasil penjumlahannya.
 */
public class Nomor10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matriksA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = scanner.nextInt();
            }
        }

        int[][] matriksB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int jumlah = matriksA[i][j] + matriksB[i][j];
                System.out.print(jumlah + " ");
            }
            System.out.println();
        }
    }
}
