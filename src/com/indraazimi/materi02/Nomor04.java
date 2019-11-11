package com.indraazimi.materi02;

import java.util.Scanner;

public class Nomor04 {

    public static void main(String[] args) {
        final float PI = 3.14f;

        Scanner scanner = new Scanner(System.in);
        float jari2 = scanner.nextFloat();
        float keliling = 2 * PI * jari2;
        System.out.println(keliling);
    }
}
