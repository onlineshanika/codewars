package com.codewars.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingDuplicatesTest {


    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void oneDuplicateValue() {
        assertEquals(1, CountingDuplicates.duplicateCount("abca"));
    }


    @Test
    public void twoDuplicateValue() {
        assertEquals(2, CountingDuplicates.duplicateCount("abcac"));
    }

    @Test
    public void twoWithCaseDuplicateValue() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcA"));
    }

    @Test
    public void oneNumericDuplicateValue() {
        assertEquals(1, CountingDuplicates.duplicateCount("ab1sty1"));
    }
    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }

}
