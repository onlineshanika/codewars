package interviewPreparationKits;

import java.util.*;

public class ActiveTraders {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
        List<String> activeTraderList = new ArrayList<>();
        Map<String, Integer> traderMap = new LinkedHashMap<>();
        for (String name : customers) {
            if (traderMap.containsKey(name)) {
                traderMap.computeIfPresent(name, (key, cnt) -> cnt + 1);
            } else {
                traderMap.put(name, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : traderMap.entrySet()) {
            Double presentage = (Double.valueOf(entry.getValue()) / customers.size()) * 100;
            System.out.println(presentage);
            if (presentage >= 5) {
                activeTraderList.add(entry.getKey());
            }
        }
        Collections.sort(activeTraderList);
        return activeTraderList;
    }

    public static void main(String[] args) {
        mostActive(Arrays.stream(new String[]{"Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha",
                "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha",
                "Omega", "Beta"}).toList());
    }
}
