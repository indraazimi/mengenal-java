package com.indraazimi.materi11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Nomor03B {

    /**
     * Sama seperti studi kasus KPK, ketika kita berhadapan dengan FPB
     * dari 2 bilangan bulat, maka akan ada 3 kemungkinan kondisi yang
     * terjadi. Lihat komentar pada test case untuk lebih detilnya.
     */
    @Test
    public void testFPB() {
        // Test case #1: ketika kedua bilangan memiliki faktor yang sama
        assertEquals(6, Nomor03A.cariFPB(12, 30));

        // Test case #2: ketika FPB-nya sama dengan salah satu bilangan
        assertEquals(16, Nomor03A.cariFPB(16, 32));

        // Test case #3: ketika kedua bilangan tidak memiliki satu pun
        //               faktor yang sama, kecuali angka satu
        assertEquals(1, Nomor03A.cariFPB(13, 17));
    }
}
