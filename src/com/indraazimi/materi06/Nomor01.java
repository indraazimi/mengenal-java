package com.indraazimi.materi06;

import java.util.Scanner;

public class Nomor01 {

    /**
     * Mengembalikan angkatan dari kelas yang diberikan
     * @param kelas Kelas yang ingin diketahui angkatannya
     * @return Angkatan dari kelas yang diberikan
     */
    private static String getAngkatan(String kelas) {
        return "Angkatan " + kelas.substring(5, 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelas = scanner.nextLine();
        System.out.println(getAngkatan(kelas));
    }
}
