package InterviewPreparationKits;

import interviewPreparationKits.StringAnagram;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringAnagram {


    @Test
    public void stringAnagramTest() {
        assertEquals(Arrays.stream(new Integer[]{2, 1, 2, 3}),
                StringAnagram.stringAnagram(Arrays.stream(new String[]{"listen", "tow", "silent", "lisent", "two", "abc", "no", "on"}).toList(),
                Arrays.stream(new String[]{"two", "bca", "no", "listen"}).toList()));
    }

}
