package com.indraazimi.materi06;

import java.util.Scanner;

public class Nomor02 {

    /**
     * Mengacak koin, keluar angka atau gambar
     * @return Angka/Gambar hasil pengacakan
     */
    private static String getRandom() {
        int random = (int) (Math.random() * 2) + 1;
        return random == 1 ? "Angka" : "Gambar";
    }

    /**
     * Membandingkan tebakan dengan jawaban hasil pengacakan
     * @param tebakan Tebakan pengguna [angka | gambar]
     * @return Hasil perbandingan [Tebakan benar | salah]
     */
    private static String getJawaban(String tebakan) {
        return tebakan.equals(getRandom()) ? "Tebakan benar." : "Tebakan salah.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tebakan = scanner.nextLine();
        System.out.println(getJawaban(tebakan));
    }
}
