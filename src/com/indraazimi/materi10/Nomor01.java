package com.indraazimi.materi10;

public class Nomor01 {

    public static void main(String[] args) {
        int kambing = 100;

        float tahun = 0;
        while (kambing < 150) {
            kambing = (int) (kambing * 1.05);
            tahun = tahun + 0.5f;
        }

        System.out.println(tahun);
    }
}
