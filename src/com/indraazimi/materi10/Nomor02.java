package com.indraazimi.materi10;

import java.util.Scanner;

public class Nomor02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        while (n >= 2) {
            s = (n % 2) + s;
            n = n / 2;
        }
        s = n + s;
        System.out.println(s);
    }
}
