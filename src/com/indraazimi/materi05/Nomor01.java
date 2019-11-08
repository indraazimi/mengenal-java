package com.indraazimi.materi05;

import java.util.Scanner;

public class Nomor01 {

    private static void sapaDia(String nama) {
        System.out.println("Hai, " + nama + ". Semangat pagi!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        sapaDia(nama1);
        sapaDia(nama2);
    }
}
