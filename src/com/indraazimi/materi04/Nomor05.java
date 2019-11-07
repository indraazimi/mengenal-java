package com.indraazimi.materi04;

import java.util.Scanner;

public class Nomor05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kota = input.nextLine();
        int penumpang = input.nextInt();
        int harga = 0;
        switch (kota) {
            case "Jakarta" :
                harga = 145000;
                break;
            case "Bogor" :
                harga = 200000;
                break;
            case "Garut" :
            case "Purwakarta" :
                harga = 75000;
                break;
        }

        int total = penumpang * harga;
        if (total > 250000 && kota.equals("Bogor")) {
            int diskon = total * 10 / 100;
            total = total - diskon;
        }
        System.out.println(total);
    }
}
