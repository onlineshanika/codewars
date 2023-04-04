package com.codewars.sample;

public class ProdFib {

    public static long[] productFib(long prod) {
        long oldvalue = 0, newValue = 0, previos = 0;
        int result, index = 0;
        long multiplyValue = 0;
        System.out.println(prod);
        while (prod >= multiplyValue) {
            index++;
            previos = oldvalue;
            oldvalue = newValue;
            newValue = getFib(index);
            multiplyValue = oldvalue * newValue;
        }
        multiplyValue = oldvalue * previos;
        result = (multiplyValue == prod) ? 1 : 0;
        long firstValue = result == 1 ? previos : oldvalue;
        long secondValue = result == 1 ? oldvalue : newValue;
        return new long[]{firstValue, secondValue, result};
    }

    private static long getFib(long n) {
        long firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        return firstTerm;
    }

    public static int inverseFibonacci(long n) {
        int index = 1;
        int firstTerm = 0, fib2 = 1;
        while (fib2 < n) {
            int nextTerm = firstTerm + fib2;
            firstTerm = fib2;
            fib2 = nextTerm;
            index++;
        }
        return index;
    }


}
