package interviewPreparationKits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewPreparationKit {


    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer[] numbers = new Integer[a.size()];
        a.toArray(numbers);
        d = d % a.size();
        for (int i = 0; i < d; i++) {
            int first, j = 0;
            first = numbers[j];
            for (j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[j] = first;
        }
        return Arrays.stream(numbers).toList();
    }


    public static void main(String[] args) {
        List<Integer> aListDays = rotLeft(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)), 4);

        aListDays.forEach(System.out::println);
    }

}
