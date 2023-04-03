package com.codewars.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DescendingOrder {


    public int sortDesc(int number) {
        final IntStream numberArray = Arrays.stream(String.valueOf(number).chars()
                .map(x -> x - '0')
                .toArray()).sorted();
        String strOfInts = Arrays
                .stream(numberArray.toArray())
                .mapToObj(String::valueOf)
                .reduce(String::concat)
                .get();
        System.out.println( strOfInts);
        return Integer.parseInt(new StringBuilder(strOfInts).reverse().toString());

     }


}
