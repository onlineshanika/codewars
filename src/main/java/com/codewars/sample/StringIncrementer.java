package com.codewars.sample;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIncrementer {
    public static String incrementString(String theString) {

        Pattern p = Pattern.compile("([a-zA-Z]+)|(\\d+)");
        Matcher m = p.matcher(theString);
        StringBuilder tokens = new StringBuilder();
        int counter =0 ;
        while (m.find()) {
            counter ++ ;
            String token = m.group();
            if (isInt(token)) {
                tokens.append(addOne(token));
            } else {
                tokens.append(token);
            }
        }
        if (counter == 1){
            tokens.append(1);
        }

        return tokens.toString();
    }

    static boolean isInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException er) {
            return false;
        }
    }


    public static String addOne(String input) {
        // Count the number of leading zeros using a regular expression
        int numZeros = input.replaceFirst("^0+", "").length();

        // Convert the input string to an integer
        int num = Integer.parseInt(input);

        // Add 1 to the integer
        num++;

        // Convert the integer back to a string
        String result = String.format("%0" + numZeros + "d", num);

        // If the result is all nines, add an extra zero at the beginning
        if (result.matches("^9+$")) {
            result = "0" + result;
        }

        return result;
    }

}
