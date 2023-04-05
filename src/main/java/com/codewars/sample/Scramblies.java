package com.codewars.sample;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        Map<String, Long> charCount_str1 = str1.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> charCount_str2 = str2.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean returnVal = false;
        for (Map.Entry<String, Long> entry : charCount_str2.entrySet()) {
            if (charCount_str1.containsKey(entry.getKey())) {
                returnVal = charCount_str1.get(entry.getKey()) >= entry.getValue();
                if(!returnVal){
                    break;
                }
             } else {
                returnVal = false;
                break;
            }
        }
        return returnVal;
    }
}

//    scramble('rkqodlw', 'world') =