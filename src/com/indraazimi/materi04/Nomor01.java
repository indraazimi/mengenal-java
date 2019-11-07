package com.indraazimi.materi04;

import java.util.Scanner;

public class Nomor01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String huruf = scanner.nextLine();
        switch (huruf) {
            case "A": System.out.println("Excellent");
                break;
            case "B": System.out.println("Good");
                break;
            case "C": System.out.println("Average");
                break;
            case "D": System.out.println("Fail");
                break;
        }
    }
}
