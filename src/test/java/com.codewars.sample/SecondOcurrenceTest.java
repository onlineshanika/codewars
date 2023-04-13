package com.codewars.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondOcurrenceTest {
    @Test
    @DisplayName("Fixed Tests")
    void basic_test_cases() {
        assertEquals(3, SecondOcurrence.second_symbol("Hello world!!!", 'l'), "Find the index of the second symbol 'l' in the string");
        assertEquals(7, SecondOcurrence.second_symbol("Hello world!!!", 'o'), "Find the index of the second symbol 'o' in the string");
        assertEquals(-1, SecondOcurrence.second_symbol("Hello world!!!", 'A'), "The symbol 'A' is not in the string");
        assertEquals(-1, SecondOcurrence.second_symbol("", 'q'),"The symbol 'q' is not in the string");
        assertEquals(-1, SecondOcurrence.second_symbol("Hello", '!'), "The symbol '!' is not in the string");
    }
}
