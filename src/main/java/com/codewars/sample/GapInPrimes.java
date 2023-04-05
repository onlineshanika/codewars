package com.codewars.sample;

import java.util.List;
import java.util.stream.IntStream;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        int previous = 0;
        for (int x = (int) m; x <= n ; x++) {
            if (isPrime(x)) {
                int gap = x - previous;
                if (gap == g) {
                    return new long[]{previous, x};
                }
                previous = x;
            }

        }
        return null;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
