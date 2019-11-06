package com.indraazimi.materi9;

import java.util.Scanner;

/**
 * Program {@link Nomor08} berjalan benar, namun masih kurang
 * efisien, karena untuk mencari faktor dari n, kita tidak perlu
 * melakukan loop sampai n, tapi cukup sampai akar dari n saja.
 */
public class Nomor09 {

    private static boolean isPrime(int n) {
        // Bilangan yang lebih kecil dari 2 pasti bukan prima
        if (n < 2) return false;

        // Bilangan yang sama dengan 2 sudah pasti prima
        if (n == 2) return true;

        // Bilangan yang genap selain 2 pasti bukan prima
        if (n % 2 == 0) return false;

        // Jika bilangannya ganjil > 2, kita cek dengan loop.
        // PERHATIKAN di sini i < n diganti menjadi i <= batas
        int batas = (int) Math.sqrt(n);
        for (int i = 3; i <= batas; i=i+2) {
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
