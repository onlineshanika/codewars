package com.codewars.sample;

import java.math.BigInteger;

public class NumberOfTrailingZerosOfN {

    public static long zeros(int n) {
        BigInteger number = factorial(BigInteger.valueOf(n));
        System.out.println(number);
        return  String.valueOf(number).length() - String.valueOf(number).replaceAll("0*$","").length();


//        BigInteger result = BigInteger.valueOf(1);
//        for (int i = 1; i <= n; i++) {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println(result);
//
//        return  String.valueOf(result).length() - String.valueOf(result).replaceAll("0*$","").length();
    }


    static BigInteger factorial(BigInteger n){
        if (n.intValue() == 0)
            return BigInteger.valueOf(1);
        else

            return(n.multiply(factorial(BigInteger.valueOf(n.intValue()-1))));
    }
}
