package com.indraazimi.materi04;

import java.util.Scanner;

public class Nomor02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        switch (angka) {
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            case 4:
                System.out.println("empat");
                break;
            case 5:
                System.out.println("lima");
                break;
            case 6:
                System.out.println("enam");
                break;
            case 7:
                System.out.println("tujuh");
                break;
            case 8:
                System.out.println("delapan");
                break;
            case 9:
                System.out.println("sembilan");
                break;
            case 10:
                System.out.println("sepuluh");
                break;
            default:
                System.out.println("ini berapa ya?");
                break;
        }
    }
}
