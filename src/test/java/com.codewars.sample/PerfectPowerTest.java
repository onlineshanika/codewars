package com.codewars.sample;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static java.lang.Math.log;
import static org.junit.jupiter.api.Assertions.*;


public class PerfectPowerTest {

    @Test
    public void test0() {
        assertNull(PerfectPower.isPerfectPower(0));
    }

    @Test
    public void test1() {
        assertNull(PerfectPower.isPerfectPower(1));
    }

    @Test
    public void test2() {
        assertNull(PerfectPower.isPerfectPower(2));
    }

    @Test
    public void test3() {
        assertNull(PerfectPower.isPerfectPower(3));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2,2}, PerfectPower.isPerfectPower(4));
    }

    @Test
    public void test5() {
        assertNull( PerfectPower.isPerfectPower(5));
    }

    @Test
    public void test8() {
        assertArrayEquals( new int[]{2,3}, PerfectPower.isPerfectPower(8));
    }

    @Test
    public void test9() {
        assertArrayEquals( new int[]{3,2}, PerfectPower.isPerfectPower(9));
    }

    @Test
    public void testUpTo500() {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i: pp) assertNotNull( PerfectPower.isPerfectPower(i));
    }

    @Test
    public void testRandomPerfectPowers() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int m = rnd.nextInt(254)+2;
            int k = (int)(rnd.nextDouble()*(log(Integer.MAX_VALUE)/log(m)-2.0)+2.0);
            int l = ipow(m, k);
            int[] r = PerfectPower.isPerfectPower(l);
            assertNotNull( r);
            assertEquals( l, ipow(r[0], r[1]));
        }
    }

    @Test
    public void testRandomNumbers() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int l = rnd.nextInt(Integer.MAX_VALUE);
            int[] r = PerfectPower.isPerfectPower(l);
            if (r != null) assertEquals(l, ipow(r[0], r[1]));
        }
    }

    private static int ipow(int b, int e) {
        int p = 1;
        for (; e > 0; e >>= 1) {
            if ((e & 1) == 1) p *= b;
            b *= b;
        }
        return p;
    }

}
