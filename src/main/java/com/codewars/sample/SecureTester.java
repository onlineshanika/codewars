package com.codewars.sample;

public class SecureTester {


    public static boolean alphanumeric(String theString) {
//        ^[a-zA-Z0-9]+$
        return theString.matches("^[a-zA-Z0-9]+$");
    }

}
