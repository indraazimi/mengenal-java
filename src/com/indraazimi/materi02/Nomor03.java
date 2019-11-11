package com.indraazimi.materi02;

import java.util.Scanner;

public class Nomor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int panjang = scanner.nextInt();
        int lebar = scanner.nextInt();
        int luas = panjang * lebar;
        System.out.println(luas);
    }
}
