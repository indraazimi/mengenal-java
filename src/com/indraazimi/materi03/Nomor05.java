package com.indraazimi.materi03;

import java.util.Scanner;

public class Nomor05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float bilDesimal = scanner.nextFloat();
        int bilBulat = (int) bilDesimal;
        float pecahan = bilDesimal - bilBulat;
        if (pecahan >= 0.5) {
            bilBulat++;
        }
        System.out.println(bilBulat);
    }
}
