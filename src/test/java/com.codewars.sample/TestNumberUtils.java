package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNumberUtils {

    @Test
    void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NumberUtils.isNarcissistic(112), "112 is not narcissistic");
        assertFalse(NumberUtils.isNarcissistic(1580919861), "1580919861 is not narcissistic");
        assertFalse(NumberUtils.isNarcissistic(1081230117), "1081230117 is not narcissistic");
    }

}
