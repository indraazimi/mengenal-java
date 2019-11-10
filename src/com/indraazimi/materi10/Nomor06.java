package com.indraazimi.materi10;

import java.util.Scanner;

/**
 * Program sederhana untuk mengecek angka-angka yang diinputkan
 * pengguna adalah bilangan Armstrong atau bukan. Yaitu sebuah
 * bilangan yang jumlah dari pangkat 3 digit-digitnya sama dengan
 * bilangan itu sendiri. Sebagai contoh, angka 153 adalah bilangan
 * Armstrong karena 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 */
public class Nomor06 {

    private static boolean isArmstrongNumber(int angka) {
        int jumlah = 0;
        int temp = angka;
        while (temp > 0) {
            // Ambil digit terakhir, pangkatkan tiga, lalu jumlahkan
            int digit = temp % 10;
            jumlah = jumlah + digit * digit * digit;

            // Hilangkan digit terakhir karena sudah selesai diproses
            temp = temp / 10;
        }
        return jumlah == angka;
    }

    public static void main(String[] args) {
        // Baris pertama masukan adalah banyaknya angka-angka yang
        // ingin diinputkan, diikuti angka-angka yang harus dicek.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(isArmstrongNumber(angka[i]))
                System.out.println("YA");
            else
                System.out.println("BUKAN");
        }
    }
}
