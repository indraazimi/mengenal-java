package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil1 = scanner.nextInt();
        int bil2 = scanner.nextInt();
        if (bil1 < bil2)
            System.out.println(bil1 + " " + bil2);
        else
            System.out.println(bil2 + " " + bil1);
    }
}
