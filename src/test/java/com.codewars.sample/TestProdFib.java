package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProdFib {

    @Test
    public void test1() {
        long[] r = new long[]{55, 89, 1};
        assertArrayEquals(r, ProdFib.productFib(4895));
    }

    @Test
    public void test2() {
        long[] r = new long[]{89, 144, 0};
        assertArrayEquals(r, ProdFib.productFib(5895));
    }

   @Test
    public void test3() {
        long[] r = new long[]{1836311903,2971215073L , 0};
        assertArrayEquals(r, ProdFib.productFib(4456077604922913920L));
    }



    }
