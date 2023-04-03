package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDescendingOrder {


    @Test
    public void testSortDesc(){

        DescendingOrder descendingOrder = new DescendingOrder();
        ;
        assertEquals(54421,descendingOrder.sortDesc(42145));

    }
}
