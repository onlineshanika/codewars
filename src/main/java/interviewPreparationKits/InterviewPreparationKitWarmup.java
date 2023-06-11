package interviewPreparationKits;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewPreparationKitWarmup {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> socks) {
        int noOfPairs = 0;
        Map<Integer, Long> result = socks.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : result.entrySet()) {
            long count = entry.getValue() / 2;
            noOfPairs += count;
        }
        return noOfPairs;
    }


    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int noOfValleys = 0;
        boolean isBelowSeaLevel = false;
        int currentLevel = 0;
        char[] stepArray = path.toUpperCase().toCharArray();
        for (int x = 0; x < steps; x++) {
            char step = stepArray[x];
            if (step == 'D') {
                currentLevel--;
            } else {
                currentLevel++;
            }
            isBelowSeaLevel = currentLevel <= 0;

            if (isBelowSeaLevel && (x + 1 != steps) && step == 'U' && stepArray[x + 1] == 'D') {
                noOfValleys++;

            }
        }
        return noOfValleys;

    }


    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int clouds = 0;
        int cloud;
        int next, oneAfterNext;
        while (clouds < c.size()) {
            System.out.println(clouds);
            cloud = c.get(clouds);
            if (cloud == 0) {
                next = (clouds + 1 < c.size()) ? c.get(clouds + 1) : -1;
                oneAfterNext = (clouds + 2 < c.size()) ? c.get(clouds + 2) : -1;
                if (next == 0 || oneAfterNext == 0) {
                    jumps++;
                    if (oneAfterNext == 0) {
                        clouds += 2;
                    } else {
                        clouds++;
                    }
                } else {
                    clouds++;
                }
            } else {
                clouds++;
            }
        }

        return jumps;
    }


    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long noOfTimes = 0;
        int lengthOfString = s.length();
        int count = useRecursion(s, 'a', 0);
        long x = n / lengthOfString;
        long remainder = n % lengthOfString;
        String remainderLengthOfString = s.substring(0, (int) remainder);
        long remainderCount = useRecursion(remainderLengthOfString, 'a', 0);

        noOfTimes = (count * x) + remainderCount;

        return noOfTimes;
    }

    private static int useRecursion(String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + useRecursion(someString, searchedChar, index + 1);
    }


}
