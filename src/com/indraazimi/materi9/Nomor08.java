package com.indraazimi.materi9;

import java.util.Scanner;

/**
 * Program {@link Nomor07} berjalan benar, namun masih kurang
 * efisien. Kita semua tahu, bilangan ganjil tidak akan pernah
 * habis dibagi bilangan genap, sehingga bisa kita lewati saja.
 */
public class Nomor08 {

    private static boolean isPrime(int n) {
        // Bilangan yang lebih kecil dari 2 pasti bukan prima
        if (n < 2) return false;

        // Bilangan yang sama dengan 2 sudah pasti prima
        if (n == 2) return true;

        // Bilangan yang genap selain 2 pasti bukan prima
        if (n % 2 == 0) return false;

        // Jika bilangannya ganjil > 2, kita cek dengan loop.
        // PERHATIKAN di sini i++ diganti menjadi i=i+2
        for (int i = 3; i < n; i=i+2) {
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
