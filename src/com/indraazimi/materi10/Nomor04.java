package com.indraazimi.materi10;

import java.util.Scanner;

/**
 * Permainan tebak angka sederhana dimana pengguna diminta
 * menebak angka 1-10, lalu program akan memberikan feedback
 * apakah tebakannya benar atau salah. Pengguna akan diminta
 * terus menebak sampai tebakannya benar.
 */
public class Nomor04 {

    public static void main(String[] args) {
        System.out.println("Permainan TEBAK ANGKA 1-10");
        Scanner scanner = new Scanner(System.in);
        int jawaban = (int) (Math.random() * 10) + 1;
        boolean tebakanBenar = false;

        // Di sini kita menggunakan loop do-while karena
        // pengguna harus menebak angkanya minimal 1x
        do {
            System.out.println("Masukkan tebakan:");
            int tebakan = scanner.nextInt();
            if (tebakan == jawaban) {
                System.out.println("Tebakan benar!");
                tebakanBenar = true;
            }
            else {
                System.out.println("Tebakan salah!");
            }
        } while (!tebakanBenar);
    }
}
