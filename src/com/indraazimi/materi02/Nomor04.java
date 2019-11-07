package com.indraazimi.materi02;

import java.util.Scanner;

public class Nomor04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai1 = scanner.nextInt();
        int nilai2 = scanner.nextInt();
        int nilai3 = scanner.nextInt();
        float rata2 = (nilai1 + nilai2 + nilai3) / 3f;
        System.out.println(rata2);
    }
}
