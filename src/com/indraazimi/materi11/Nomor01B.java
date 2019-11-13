package com.indraazimi.materi11;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Nomor01B {

    /**
     * Ketika kita menguji sebuah bilangan bulat merupakan bilangan
     * Armstrong atau bukan, maka hanya akan ada dua kemungkinan
     * jawaban: ya atau bukan. Oleh sebab itu, di sini kita cukup
     * melakukan 2 test case saja.
     */
    @Test
    public void testArmstrong() {
        // Test case #1: ketika bilangan termasuk bilangan Armstrong
        assertTrue(Nomor01A.isArmstrongNumber(153));

        // Test case #2: ketika bilangan bukan bilangan Armstrong
        assertFalse(Nomor01A.isArmstrongNumber(351));
    }
}
