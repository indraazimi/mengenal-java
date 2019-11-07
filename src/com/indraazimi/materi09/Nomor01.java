package com.indraazimi.materi09;

import java.util.Scanner;

public class Nomor01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = 1;
        int c = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j == n) {
                    if (Math.abs(r-c) > Math.abs(i-j)) {
                        r = i;
                        c = j;
                    }
                }
            }
        }
        System.out.println(r + " " + c);
    }
}
