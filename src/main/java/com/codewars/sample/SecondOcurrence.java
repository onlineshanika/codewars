package com.codewars.sample;

public class SecondOcurrence {
    public static int second_symbol(String theString, char c) {
        int counter = 0;
        char[] charaArray = theString.toCharArray();
        for (int x = 0; x < charaArray.length; x++) {
            if (charaArray[x] == c) {
                ++counter;
                if (counter == 2) {
                    return x;
                }
            }
        }
        return -1;
    }
}
