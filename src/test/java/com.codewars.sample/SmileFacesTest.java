package com.codewars.sample;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmileFacesTest {

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }

    @Test
    public void test7() {
        List<String> a =  new ArrayList<String>();


        a.add("[:)");a.add("od)");a.add("o~D");a.add("'~)");a.add(":x");a.add(";-)");a.add(":D");a.add(";)");a.add("4D");a.add(":~dp");
        a.add(":~)");a.add(":~P");a.add("pp");a.add("x;-D");a.add(":~~D");a.add(":~8)");a.add("oD)");a.add("48D");
        a.add(";-X");a.add("8px");a.add(":-D");a.add("o8)");a.add(";pP");a.add("-8D");a.add("'xd");a.add("4D");
        a.add(":D");a.add("(o)");a.add(";-Dd");a.add(";D");a.add(":P");a.add("oP");a.add(":-D]");
        assertEquals(10, SmileFaces.countSmileys(a));
    }
//    @Test
//    public void test6() {
//        List<String> a =  new ArrayList<String>();
//
//        a.add(":d)");a.add(";)");a.add("5p)");a.add(":)");a.add(":P");a.add("(D");a.add("4p)");a.add("~(-D");a.add(":P");
//        a.add(":~D");a.add(";x)");a.add(";~)");a.add(":~X");a.add(":~D");a.add("o(D");a.add("42D");a.add("o~D");
//        a.add("~'o)");a.add(":xD");a.add("'~D");a.add(":)");a.add("d:dd");a.add(":D");
//        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
//        assertEquals(7, SmileFaces.countSmileys(a));
//    }
}
