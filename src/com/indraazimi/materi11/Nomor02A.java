package com.indraazimi.materi11;

import java.util.Scanner;

/**
 * Program untuk mencari Kelipatan Persekutuan Terkecil (KPK)
 * dari dua buah bilangan bulat yang diinput pengguna.
 */
public class Nomor02A {

    static int cariKPK(int angka1, int angka2) {
        int max = Math.max(angka1, angka2);
        int kpk = max;
        while (kpk % angka1 != 0 || kpk % angka2 != 0) {
            kpk += max;
        }
        return kpk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        System.out.println(cariKPK(angka1, angka2));
    }
}
