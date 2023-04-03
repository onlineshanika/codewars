package com.codewars.sample;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {

        String numberInStr = String.valueOf(number);
        int length = numberInStr.length();
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger num = BigInteger.valueOf(0);
        int res;

        for (char c : numberInStr.toCharArray()) {
            num = BigInteger.valueOf(Character.getNumericValue(c));
            sum =sum.add(num.pow(length));
        }
        System.out.println(sum );

//
//        res = sum.compareTo(new BigInteger(number));
//        System.out.println(res);
        return sum.intValue() <= number ;

    }

}
