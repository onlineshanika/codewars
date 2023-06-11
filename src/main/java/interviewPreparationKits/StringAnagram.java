package interviewPreparationKits;

import java.util.*;

public class StringAnagram {


    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        Map<String, Integer> returnMap = new LinkedHashMap<>();

        for (String val : query) {
            char[] sorted = val.trim().toCharArray();
            Arrays.sort(sorted);
            returnMap.put(new String(sorted).toLowerCase(), 0);
        }

        for (String val : dictionary) {
            char[] sorted = val.trim().toCharArray();
            Arrays.sort(sorted);
            String newVal = new String(sorted).toLowerCase();
            if (returnMap.containsKey(newVal)) {
                returnMap.computeIfPresent(newVal, (key, cnt) -> cnt + 1);
            }
        }

        return new LinkedList<>(returnMap.values());
    }

}
