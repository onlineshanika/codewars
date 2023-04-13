package com.codewars.sample;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> inputs) {
        //loop input
        //valid inputs will be in in alist
        //compare the  two list
        int counter = 0;
        for (String input : inputs) {
            boolean hasNose = false;
            boolean hasMouth = false;
            boolean isValid2Component = false;
            char[] componts = input.toCharArray();
            //check for eyes
            if (componts.length < 2 || componts.length > 3){
                continue;
            }

            if (!String.valueOf(componts[0]).matches((".*[:;].*"))) {
                continue;
            }
            //check nose - not mandatory
            if (String.valueOf(componts[1]).matches((".*[~\\-].*"))) {
                hasNose = true;
            }
            if (!hasNose) {
                if (String.valueOf(componts[1]).matches((".*[D)].*"))) {
                    hasMouth = true;
                } else {
                    continue;
                }
            }

            if (String.valueOf(componts[1]).matches((".*[~\\-D)].*"))) {
                isValid2Component = true;
            }

            if(hasMouth && componts.length == 3 ){
                continue;
            }

            // check for the m
            if (componts.length == 3 && (String.valueOf(componts[2]).matches((".*[D)].*"))) && !hasMouth) {
                hasMouth = true;
            }

            if (hasMouth && isValid2Component) {
                System.out.println("  --   " + input);
                counter++;
            }
        }

        return counter;
    }
}


//    Valid smiley face examples: :) :D ;-D :~)

//    Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//        A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//        Every smiling face must have a smiling mouth that should be marked with either ) or D
