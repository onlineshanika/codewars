package InterviewPreparationKits;

import interviewPreparationKits.InterviewPreparationKitArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterviewPreparationKitArrays {


    @Test
    public void hourglassSum() {
        Integer[][] twoDArray = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (Integer[] array : twoDArray) {
            list.add(Arrays.asList(array));
        }

        assertEquals(19, InterviewPreparationKitArrays.hourglassSum(list));
    }
}
