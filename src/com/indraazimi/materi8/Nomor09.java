package com.indraazimi.materi8;

import java.util.Scanner;

/**
 * Contoh penggunaan nested loop di dunia nyata yaitu ketika
 * kita ingin memproses matriks dua dimensi. Di sini, selain
 * menggunakan nested loop, kita juga menggunakan array 2D.
 * Program ini akan meminta matriks berukuran n x n dari
 * pengguna, kemudian menampilkan matriks tersebut di layar.
 */
public class Nomor09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Array dua dimensi ditandai dengan adanya 2 kurung siku
        // pada deklarasi variabel (letak [][] setelah tipe data)
        int[][] matriks = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
