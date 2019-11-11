package com.indraazimi.materi07;

public class Nomor10 {

    public static void main(String[] args) {
        int kali = 1;
        for (int i = 1; i <= 64; i=i*2) {
            kali = kali * i;
        }
        System.out.println(kali);
    }
}
