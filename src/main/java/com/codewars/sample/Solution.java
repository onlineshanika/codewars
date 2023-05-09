package com.codewars.sample;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution {


    public static void main(String[] args) {
//        ArrayList<List<Integer>> number = new ArrayList<>();
//        ArrayList<Integer> number1 = new ArrayList<>();
//        number1.add(11);
//        number1.add(2);
//        number1.add(4);
//        number.add(number1);
//
//        ArrayList<Integer> number2 = new ArrayList<>();
//        number2.add(4);
//        number2.add(5);
//        number2.add(6);
//        number.add(number2);
//
//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(10);
//        number.add(8);
//        number.add(-12);
////        number.add(number3);
//        Integer[] ints = {-4, 3, -9, 0, 4, 1};
 ;
//        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        timeConversion("11:00:01AM");
//        staircase(6);
    }

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();

    }


    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> resultList = new LinkedList<>();
        int winsForA = 0;
        int winsForB = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                ++winsForA;
            } else if (a.get(i) < b.get(i)) {
                ++winsForB;
            }
        }
        resultList.add(winsForA);
        resultList.add(winsForB);

        return resultList;
    }


    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long num : ar) {
            sum += num;
        }
        return sum;

    }



    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> main) {
        int mainIndex = 0;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        while (mainIndex < main.size()) {
            List<Integer> subList = main.get(mainIndex);
            int secondDiagonalIndex = subList.size() - 1 - mainIndex;
            primaryDiagonalSum += subList.get(mainIndex);
            secondaryDiagonalSum += subList.get(secondDiagonalIndex);
            mainIndex++;
        }
        return Math.abs (primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void plusMinus(List<Integer> arr) {
        double numberOfPlusValues =0;
        double numberOfMinusValues =0;
        double numberOfZeros =0;

        for (Integer num:arr){
            if(num > 0){
                numberOfPlusValues ++;
            }else if(num < 0){
                numberOfMinusValues ++;
            }else {
                numberOfZeros ++ ;
            }
        }
        System.out.println((numberOfPlusValues != 0 ?numberOfPlusValues/arr.size():0));
        System.out.println((numberOfMinusValues != 0 ?numberOfMinusValues/arr.size():0));
        System.out.println((numberOfZeros != 0 ?numberOfZeros/arr.size():0));

    }


    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        StringBuilder print ;
        int index = 0;
        int spaceIndex = 0;
        for (int i = 0; i < n; i++) {
            index = 0;
            spaceIndex = n-i-1;
            print = new StringBuilder();
            while (spaceIndex > 0){
                print.append(" ");
                spaceIndex -- ;
            }
            while (index <= i ){
                print.append("#");
                index ++ ;
            }
            System.out.println(print);
        }

    }


    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long min = 0 ,max =0;
        for (int i = 0; i < arr.size(); i++) {
            if(i != 0 ){
                max += arr.get(i);
            }
            if(i != arr.size() -1 ){
                min += arr.get(i);
            }
        }
        System.out.println(min +" "+max);
    }


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
//        System.out.println(timeStr);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
//        LocalTime time = LocalTime.parse(timeStr, formatter);
////        System.out.println(time);
//
//        return time.toString();


        // Extracting hours, minutes and seconds from the input string
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));

        // Checking if the time is in PM and not already 12:00:00 PM
        if (s.charAt(8) == 'P' && hours != 12) {
            hours += 12;
        }

        // Checking if the time is in AM and 12:00:00 AM
        if (s.charAt(8) == 'A' && hours == 12) {
            hours = 0;
        }

        // Formatting the output string
        String militaryTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return militaryTime;

    }
//    07:05:45PM
//    Sample Output
//19:05:45


}
