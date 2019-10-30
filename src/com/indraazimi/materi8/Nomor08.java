package com.indraazimi.materi8;

public class Nomor08 {

    public static void main(String[] args) {
        int n = 5;
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                total = total + j;
            }
            total = total + i;
        }
        System.out.println(total);
    }
}
