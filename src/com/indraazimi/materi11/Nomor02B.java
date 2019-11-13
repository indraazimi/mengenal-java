package com.indraazimi.materi11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Nomor02B {

    /**
     * Ketika kita berhadapan dengan KPK dari 2 bilangan bulat,
     * maka akan ada 3 kemungkinan kondisi yang terjadi. Lihat
     * komentar pada test case untuk lebih detilnya.
     */
    @Test
    public void testKPK() {
        // Test case #1: ketika kedua bilangan memiliki faktor yang sama
        assertEquals(60, Nomor02A.cariKPK(12, 30));

        // Test case #2: ketika KPK-nya sama dengan salah satu bilangan
        assertEquals(32, Nomor02A.cariKPK(16, 32));

        // Test case #3: ketika kedua bilangan tidak memiliki satu pun
        //               faktor yang sama, kecuali angka satu
        assertEquals(221, Nomor02A.cariKPK(13, 17));
    }
}
