package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCold = scanner.nextBoolean();
        if (isCold) {
            System.out.println("Di luar dingin, pakai jaket ya!");
        }
    }
}
