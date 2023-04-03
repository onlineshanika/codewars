package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestProdFib {

    @Test
    public void test0() {
        long[] r = new long[]{55, 89, 1};
        assertArrayEquals(r, ProdFib.productFib(800));
    }
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



    }
