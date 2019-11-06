package com.indraazimi.materi9;

import java.util.Scanner;

/**
 * Program sederhana untuk menguji apakah sebuah bilangan
 * bulat n termasuk bilangan prima, atau bukan.
 */
public class Nomor06 {

    private static boolean isPrime(int n) {
        // Pertama, hitung jumlah faktor dari bilangan n
        int faktor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                faktor++;
        }

        // Jika faktornya hanya ada dua, yaitu 1 dan n,
        // maka bilangan ini termasuk bilangan prima
        return faktor == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n))
            System.out.println("PRIMA");
        else
            System.out.println("BUKAN");
    }
}
