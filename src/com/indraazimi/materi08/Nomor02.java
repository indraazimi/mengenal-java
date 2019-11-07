package com.indraazimi.materi08;

/**
 * Array datang sebagai penyelamat. Array is an object that stores
 * a collection of values with same data type. Coding panjang di
 * {@link Nomor01} tadi bisa diringkas menjadi 3 baris ini saja.
 *
 * Jika kemudian peserta arisan bertambah, coding kita juga tidak
 * akan banyak berubah, hanya mengubah peserta dan jumlahnya saja.
 */
public class Nomor02 {

    public static void main(String[] args) {
        // Array dideklarasikan menggunakan tanda [] di tipe data,
        // diikuti tanda { } jika ingin langsung diinisialisasi
        String[] peserta = { "Dira", "Arid", "Irad", "Radi" };

        // Array selalu dimulai dari indeks 0, maka di sini kita
        // cukup mengacak angka mulai dari 0 sampai 3 saja
        int random = (int) (Math.random() * 4);

        // Array diakses dengan namanya diikuti indeks dalam [ ]
        System.out.println(peserta[random]);
    }
}
