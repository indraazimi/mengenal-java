package com.indraazimi.materi02;

import java.util.Scanner;

public class Nomor06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();
        int tahun = scanner.nextInt();
        int usia = 2019 - tahun;
        System.out.println("Hai, " + nama + ".");
        System.out.println("Kamu lahir tahun " + tahun + ".");
        System.out.println("Berarti usiamu sekarang " + usia + " tahun ya?");
    }
}
