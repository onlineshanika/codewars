package interviewPreparationKits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InterviewPreparationKitArrays {


    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> matrix) {
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < matrix.size()-2; i++) {
            int subListSize = matrix.get(i).size();
            for (int j = 0; j < subListSize-2; j++) {
                sumList.add(createMatrix(matrix, i, j));
                Collections.sort(sumList);
            }
        }
        return sumList.get(sumList.size() - 1);
    }

    public static int createMatrix(List<List<Integer>> matrix, int row, int col) {
        List<List<Integer>> newMatrix = matrix.subList(row, row + 3);
        LinkedList<List<Integer>> createdMatrix = new LinkedList<List<Integer>>();
        int matrixSum = 0;
        for (int x = 0; x < 3; x++) {
            List<Integer> list = newMatrix.get(x).subList(col, col + 3);
            Integer sum = list.stream().reduce(0, Integer::sum);
            createdMatrix.add(newMatrix.get(x).subList(col, col + 3));
            if (x != 1) {
                matrixSum += sum;
            } else {
                matrixSum += list.get(1);
            }
        }
        System.out.println(matrixSum);
        createdMatrix.forEach(System.out::println);

        return matrixSum;
    }

}
