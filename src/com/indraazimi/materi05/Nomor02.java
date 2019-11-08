package com.indraazimi.materi05;

import java.util.Scanner;

public class Nomor02 {

    private static float konversiFahrenheit(int celcius) {
        return celcius * 9f / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int avg = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.print(konversiFahrenheit(min) + " ");
        System.out.print(konversiFahrenheit(avg) + " ");
        System.out.println(konversiFahrenheit(max));
    }
}
