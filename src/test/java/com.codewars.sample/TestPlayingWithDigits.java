package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlayingWithDigits {

    @Test
    public void Test1() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }

}
