package com.codewars.sample;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {
    public static List<String> top3(String string) {
        Map<String, Integer> wordCounterMap = new HashMap<>();
        String clean = string.replaceAll("[^a-zA-Z']+", " ");

        StringTokenizer tokens = new StringTokenizer(clean.toLowerCase(Locale.ROOT));
        while (tokens.hasMoreTokens()) {
            String nextToken = tokens.nextToken();
            if (!(nextToken.startsWith("'") && nextToken.endsWith("'"))) {
                if (wordCounterMap.containsKey(nextToken)) {
                    int val = wordCounterMap.get(nextToken);
                    wordCounterMap.put(nextToken, ++val);
                } else {
                    wordCounterMap.put(nextToken, 1);
                }
            }
        }

        Map<String, Integer> result = wordCounterMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        return new ArrayList<>(result.keySet()).subList(0,  Math.min(result.size(), 3));


//        return Arrays.stream(s.toLowerCase().split("[^a-z*|']"))
//                .filter(o -> !o.isEmpty() && !o.replace("'","").isEmpty())
//                .collect(groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .map(Map.Entry::getKey)
//                .limit(3)
//                .collect(Collectors.toList());

    }
}
