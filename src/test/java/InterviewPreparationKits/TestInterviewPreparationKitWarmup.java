package InterviewPreparationKits;

import interviewPreparationKits.InterviewPreparationKitWarmup;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterviewPreparationKitWarmup {

    @Test
    public void sockMerchant() {
        assertEquals(3, InterviewPreparationKitWarmup.sockMerchant(9, Arrays.stream(new Integer[]{10, 20, 20, 10, 10, 30, 50, 10, 20}).toList()));
    }

    @Test
    public void countingValleys() {
        assertEquals(1, InterviewPreparationKitWarmup.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void countingValleystest2() {
        assertEquals(2, InterviewPreparationKitWarmup.countingValleys(12, "DDUUDDUDUUUD"));
    }

    @Test
    public void countingValleystestDDUDDUUDUU() {
        assertEquals(1, InterviewPreparationKitWarmup.countingValleys(10, "DDUDDUUDUU"));
    }


    @Test
    public void jumpingOnClouds() {
        assertEquals(4, InterviewPreparationKitWarmup.jumpingOnClouds(Arrays.stream(new Integer[]{0, 0, 1, 0, 0, 1, 0}).toList()));
    }

    @Test
    public void repeatedString_abc() {
        assertEquals(7, InterviewPreparationKitWarmup.repeatedString( "aba",10));
    }

}
