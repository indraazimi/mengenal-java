package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bil1 = scanner.nextInt();
        int bil2 = scanner.nextInt();
        int bil3 = scanner.nextInt();

        if (bil1 < bil2 && bil1 < bil3) {
            System.out.print(bil1 + " ");
            if (bil2 < bil3)
                System.out.println(bil2 + " " + bil3);
            else
                System.out.println(bil3 + " " + bil2);
        }
        else if (bil2 < bil1 && bil2 < bil3) {
            System.out.print(bil2 + " ");
            if (bil1 < bil3)
                System.out.println(bil1 + " " + bil3);
            else
                System.out.println(bil3 + " " + bil1);
        }
        else if (bil3 < bil1 && bil3 < bil2) {
            System.out.print(bil3 + " ");
            if (bil1 < bil2)
                System.out.println(bil1 + " " + bil2);
            else
                System.out.println(bil2 + " " + bil1);
        }
    }
}
