package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryAddition {

    @Test
    public void testBinaryAddition(){
        BinaryAddition binaryAddition = new BinaryAddition();
        assertEquals("10",BinaryAddition.binaryAddition(1,1));
        assertEquals("1110",BinaryAddition.binaryAddition(9,5));
    }
}
