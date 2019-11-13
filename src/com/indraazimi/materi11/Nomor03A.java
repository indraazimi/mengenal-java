package com.indraazimi.materi11;

import java.util.Scanner;

/**
 * Program untuk mencari Faktor Persekutuan Terbesar (FPB)
 * dari dua buah bilangan bulat yang diinput pengguna.
 */
public class Nomor03A {

    static int cariFPB(int angka1, int angka2) {
        int min = Math.min(angka1, angka2);
        for (int i = min; i >= 1; i--) {
            if (angka1 % i == 0 && angka2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        System.out.println(cariFPB(angka1, angka2));
    }
}
