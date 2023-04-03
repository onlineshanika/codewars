package com.codewars.sample;

public class ProdFib {

    public static long[] productFib(long prod) {
        System.out.println(getFib(8));
        System.out.println(prod +"-------> "+inverseFibonacci(prod));
        System.out.println(getFib(16));

        return null;
    }

    private static int getFib(int n) {

        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        return secondTerm;
    }

    public static int inverseFibonacci(long n) {
//        int fib1 = 0, fib2 = 1;
        int index = 1;
//        while (fib2 < n) {
//            int nextFib = fib1 + fib2;
//            fib1 = fib2;
//            fib2 = nextFib;
//            index++;
//        }
//
//        return index ;


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
