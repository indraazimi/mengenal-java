package com.indraazimi.materi09;

import java.util.Scanner;

/**
 * Program sederhana untuk mengecek apakah sebuah kalimat
 * yang diinputkan pengguna termasuk palindrome atau bukan.
 */
public class Nomor04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();

        // Pertama, balik kalimat yang diinputkan pengguna
        String kebalikan = "";
        for (int i = kalimat.length()-1; i >= 0; i--) {
            kebalikan = kebalikan + kalimat.charAt(i);
        }

        // Jika kalimat yang diinputkan dan hasil kebalikan
        // kalimat tersebut sama, maka dikatakan palindrome
        if (kalimat.equals(kebalikan))
            System.out.println("PALINDROME");
        else
            System.out.println("BUKAN");
    }
}
