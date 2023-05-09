package algorithms.sorting;

import java.util.*;

public class ClosestNumbers {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> list) {
        List<Integer> returnList = new LinkedList<>();
        Collections.sort(list);
        int smallestGap = 0;
        int gap = 0;
        for (int x = 0; x < list.size() - 1; x++) {
            gap = Math.abs(list.get(x + 1) - list.get(x));
            if(smallestGap == 0){
                smallestGap = gap;
            }
            if(gap < smallestGap){
                returnList = new LinkedList<>();
            }
            if (gap <= smallestGap) {
                returnList.add(list.get(x));
                returnList.add(list.get(x + 1));
                smallestGap = gap;
            }

        }

        return returnList;

    }


    public static void main(String[] args) {
        List<Integer> list = closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470));

        System.out.println(" ---------------------------------");
        for (Integer integer : list) {
            System.out.println(integer);

        }


    }
}
