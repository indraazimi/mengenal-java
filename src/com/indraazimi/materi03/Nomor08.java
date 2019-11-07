package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int jarak;
        if (x1 > x2)
            jarak = x1 - x2;
        else
            jarak = x2 - x1;
        if (y1 > y2)
            jarak += y1 - y2;
        else
            jarak += y2 - y1;

        System.out.println(jarak);
    }
}
