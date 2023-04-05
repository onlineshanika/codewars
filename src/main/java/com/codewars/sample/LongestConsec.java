package com.codewars.sample;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {

        String longestConsec = "";
        int length = 0;
        StringBuilder builder = null;

        for (int x = 0; x <= strarr.length - k; x++) {
            builder = new StringBuilder();
            for (int y = 0; y < k; y++) {
                builder.append(strarr[x + y]);
            }
            if (length < builder.length()) {
                length= builder.length();
                longestConsec = builder.toString();
            }
        }

        return longestConsec;
    }
}
