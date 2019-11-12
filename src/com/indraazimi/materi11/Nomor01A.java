package com.indraazimi.materi11;

import java.util.Scanner;

public class Nomor01A {

    static boolean isArmstrongNumber(int angka) {
        int jumlah = 0;
        int temp = angka;
        while (temp > 0) {
            int digit = temp % 10;
            jumlah = jumlah + digit * digit * digit;
            temp = temp / 10;
        }
        return jumlah == angka;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        if (isArmstrongNumber(angka))
            System.out.println("YA");
        else
            System.out.println("BUKAN");
    }
}
