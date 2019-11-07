package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil = scanner.nextInt();
        if (bil > 0)
            System.out.println("Positif");
        else
            System.out.println("Negatif");
    }
}
