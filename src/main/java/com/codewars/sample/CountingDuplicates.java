package com.codewars.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingDuplicates {


    public static int duplicateCount(String theString) {
        Set<Character> noOfDuplicates = new HashSet<>();
        Map<Character, Integer> characterCount = new HashMap<>();
        for (char c : theString.toUpperCase().toCharArray()) {
            if (characterCount.containsKey(c)) {
                int value = characterCount.get(c);
                characterCount.put(c, ++value);
                noOfDuplicates.add(c);
            } else {
                characterCount.put(c, 1);
            }   
        }
        return noOfDuplicates.size();
    }
}


// in to array
// loop the array
// create a map <Character,int>
//


