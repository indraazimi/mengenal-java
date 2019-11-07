package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil = scanner.nextInt();
        if (bil % 2 == 0)
            System.out.println("Genap");
        else
            System.out.println("Ganjil");
    }
}
