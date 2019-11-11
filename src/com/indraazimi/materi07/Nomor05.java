package com.indraazimi.materi07;

public class Nomor05 {

    private static boolean checkWifi() {
        return false;
    }

    private static void searchWifi() {
        for (int i = 1; i <= 10; i++) {
            boolean wifiAvailable = checkWifi();
            if (wifiAvailable) {
                System.out.println("Wifi found!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        searchWifi();
    }
}
