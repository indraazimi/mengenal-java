package com.indraazimi.materi10;

import java.util.Scanner;

public class Nomor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1)
            System.out.println("ya");
        else
            System.out.println("bukan");
    }
}
