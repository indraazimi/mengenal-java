package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCold = scanner.nextBoolean(); scanner.nextLine();
        if (isCold) {
            System.out.print("Di luar dingin, pakai jaket apa? ");
            String jacket = scanner.nextLine();
            System.out.println("Ok, ini jaket " + jacket + ". Dipakai ya!");
        }
    }
}
