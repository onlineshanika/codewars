package com.codewars.sample;

import com.sun.tools.attach.VirtualMachineDescriptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOddOrEven {

    @Test
     public void testOddOrEven(){
        OddOrEven oddOrEven = new OddOrEven();
        assertEquals("odd", oddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", oddOrEven.oddOrEven(new int[] {0, -1, -5}));
        assertEquals("even", oddOrEven.oddOrEven(new int[] {0, -1, 1}));
        assertEquals("even", oddOrEven.oddOrEven(new int[] { }));


    }
}
