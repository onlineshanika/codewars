package com.codewars.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(elements == null || elements.length < 1 || maxOccurrences == 0){
            return new int[] { };
        }
        LinkedList<Integer> intList = new LinkedList<>();
        Map<Integer,Integer> occurrencesMap = new HashMap<>();
        for (int i :elements) {
            if(occurrencesMap.containsKey(i)){
                if(occurrencesMap.get(i) <maxOccurrences){
                    occurrencesMap.put(i,occurrencesMap.get(i) +1);
                    intList.add(i);
                }
            }else {
                occurrencesMap.put(i,1);
                intList.add(i);
            }
        }

        return intList.stream().mapToInt(i -> i).toArray();
    }
}
