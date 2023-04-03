package com.codewars.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNumberOfTrailingZerosOfN {

    @Test
    public void testZeros() throws Exception {
        assertEquals(NumberOfTrailingZerosOfN.zeros(0), 0);
        assertEquals(NumberOfTrailingZerosOfN.zeros(6), 1);
        assertEquals(NumberOfTrailingZerosOfN.zeros(14), 2);
        assertEquals(NumberOfTrailingZerosOfN.zeros(1000), 249);
    }

}
