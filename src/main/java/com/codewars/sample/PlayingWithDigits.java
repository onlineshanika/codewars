package com.codewars.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlayingWithDigits {

    public static long digPow(int number, int power) {

        final IntStream numberArray = Arrays.stream(String.valueOf(number).chars()
                .map(x -> x - '0')
                .toArray());

        long sum = 0;
        for (int num : numberArray.toArray()) {
            sum += Math.pow(num, power);
            power++;
        }
        return sum % number != 0 ? -1 : sum / number;
    }

}
