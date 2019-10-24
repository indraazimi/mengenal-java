package com.indraazimi.materi8;

/**
 * Contoh penggunaan array yang lain. Misalkan untuk menghitung jumlah
 * dari banyak bilangan bulat. Menggabungkan array dan for-loop akan
 * membuat coding kita menjadi jauh lebih sederhana, dibandingkan jika
 * tanpa menggunakan array dan for-loop.
 */
public class Nomor03 {

    public static void main(String[] args) {
        int[] nilai = { 45, 56, 67, 78, 89 };
        int jumlah = 0;

        // Untuk mendapatkan banyak data di array, kita memanggil length
        // Di sini nilai.length = 10 karena ada 10 data di array nilai
        for (int i = 0; i < nilai.length; i++) {
            jumlah = jumlah + nilai[i];
        }

        System.out.println(jumlah);
    }
}
