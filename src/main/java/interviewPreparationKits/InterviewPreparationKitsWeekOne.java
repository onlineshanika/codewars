package interviewPreparationKits;

import com.codewars.sample.Solution;

import java.util.*;
import java.util.logging.XMLFormatter;

public class InterviewPreparationKitsWeekOne {

    public static void main(String[] args) {
//        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
//        System.out.println(countingSort(Arrays.asList(
//                63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10
//                , 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50,
//                30, 20, 1, 43, 3, 70, 95, 33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33
//        )));

        System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
//        System.out.println(caesarCipher("Hello_World!", 4));
    }


    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> integers) {
        Map<Integer, Integer> valueSet = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int x : integers) {
            if (valueSet.containsKey(x)) {
                valueSet.replace(x, valueSet.get(x) + 1);
                list.remove(String.valueOf(x));
            } else {
                valueSet.put(x, 1);
                list.add(String.valueOf(x));
            }
        }
        return Integer.parseInt(list.get(0));
    }


    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> main) {
        int mainIndex = 0;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        while (mainIndex < main.size()) {
            List<Integer> subList = main.get(mainIndex);
            int secondDiagonalIndex = subList.size() - 1 - mainIndex;
            primaryDiagonalSum += subList.get(mainIndex);
            secondaryDiagonalSum += subList.get(secondDiagonalIndex);
            mainIndex++;
        }
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> integers) {
        Integer[] intArray = new Integer[100];
        Arrays.fill(intArray, 0);
        int val = 0;
        for (int x : integers) {
            val = intArray[x];
            intArray[x] = ++val;
        }
        return Arrays.asList(intArray);

    }

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String string, int k) {
        StringBuilder returnString = new StringBuilder();
        k = k%26 ;
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                int newPosition = (int) c + k;
                if (Character.isUpperCase(c)) {
                    newPosition = newPosition > 90 ? newPosition - 26 : newPosition;
                } else {
                    newPosition = newPosition > 122 ? newPosition - 26 : newPosition;
                }
                char newChar = (char) newPosition;
                returnString.append(newChar);
            } else {
                returnString.append(c);
            }
        }
        return returnString.toString();
    }

//    Lipps_Asvph!
//    !w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
//    !m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U
//!-f`-r!.{`pezr/gwmm!wm.!/`|`~1x{tv`vf`tx`p-tx.fwvm..-!.!!-y
}
