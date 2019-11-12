package com.indraazimi.materi11;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Nomor01B {

    @Test
    public void testArmstrong() {
        assertTrue(Nomor01A.isArmstrongNumber(153));
        assertFalse(Nomor01A.isArmstrongNumber(351));
    }
}
