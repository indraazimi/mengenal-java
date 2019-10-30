package com.indraazimi.materi9;

import java.util.Scanner;

public class Nomor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = 1;
        int c = n;
        int batas = (int) Math.sqrt(n);
        for (int i = 1; i <= batas; i++) {
            if (n % i == 0) {
                int j = n / i;
                if (Math.abs(r-c) > Math.abs(i-j)) {
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println(r + " " + c);
    }
}
