package com.indraazimi.materi8;

import java.util.Scanner;

/**
 * Program sederhana yang meminta nama dari pengguna,
 * lalu menampilkan nama tersebut mulai dari belakang.
 */
public class Nomor11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
        for (int i = nama.length()-1; i >= 0; i--) {
            System.out.print(nama.charAt(i));
        }
    }
}
