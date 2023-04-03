package com.codewars.sample;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;

public class OddOrEven {

    public static final String ODD = "odd";
    public static final String EVEN = "even";


    public String oddOrEven(int[] array) {
//        int sum=0;
//        for(int x:array){
//           sum += x;
//        }
//        return sum / 2 == 0 ? EVEN : ODD;


        return (Arrays.stream(array).reduce(0, Integer::sum)) % 2 == 0 ? EVEN : ODD;
    }
}
