package com.indraazimi.materi9;

import java.util.Scanner;

/**
 * Program {@link Nomor06} berjalan benar, namun masih kurang
 * efisien. Kita semua tahu, 2 adalah bilangan prima terkecil
 * dan satu-satunya bilangan genap yang prima. Oleh karena itu,
 * di kasus-kasus ini, kita tidak perlu melakukan loop.
 */
public class Nomor07 {

    private static boolean isPrime(int n) {
        // Bilangan yang lebih kecil dari 2 pasti bukan prima
        if (n < 2) return false;

        // Bilangan yang sama dengan 2 sudah pasti prima
        if (n == 2) return true;

        // Bilangan yang genap selain 2 pasti bukan prima
        if (n % 2 == 0) return false;

        // Jika bilangannya ganjil > 2, kita cek dengan loop
        for (int i = 3; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
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
