package com.indraazimi.materi10;

import java.util.Scanner;

/**
 * Permainan tebak angka yang lebih menantang. Di sini pengguna
 * dapat menebak maksimal 3x saja. Ketika pengguna tebakan salah,
 * program akan memberikan feedback, jawabannya lebih besar atau
 * lebih kecil dari tebakan pengguna. Selain itu, pengguna dapat
 * menyerah (berhenti menebak) dengan memasukkan angka 0.
 */
public class Nomor05 {

    public static void main(String[] args) {
        System.out.println("Permainan TEBAK ANGKA 1-10");
        System.out.println("Maksimal 3x tebakan. Masukkan 0 jika menyerah.");
        Scanner scanner = new Scanner(System.in);
        int jawaban = (int) (Math.random() * 10) + 1;
        boolean gameOver = false;
        int tebakanKe = 1;

        do {
            System.out.println("Tebakan ke-" + tebakanKe + ":");
            int tebakan = scanner.nextInt();
            if (tebakan == 0) {
                // Pengguna menyerah. Langsung saja kasi tau jawabannya.
                System.out.println("Lain kali jangan menyerah ya!");
                System.out.println("Angka yang benar: " + jawaban);
                gameOver = true;
            }
            else if (tebakan == jawaban) {
                System.out.println("Horee.. Tebakan benar!");
                gameOver = true;
            }
            else {
                if (tebakanKe == 3) {
                    // Pengguna sudah salah menebak sebanyak 3x. Beri tahu
                    // jawaban yang benar agar dia tidak penasaran.
                    System.out.println("Tebakanmu salah. Angka yang benar: " + jawaban);
                    System.out.println("Coba lagi nanti! Semoga beruntung!");
                    gameOver = true;
                }
                else {
                    tebakanKe++;
                    if (jawaban > tebakan)
                        System.out.println("Angkanya lebih besar.");
                    else
                        System.out.println("Angkanya lebih kecil.");
                }
            }
        } while (!gameOver);
    }
}
