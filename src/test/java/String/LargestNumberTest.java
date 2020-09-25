package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {
    @Mock
    public LargestNumber solution;

    @Before
    public void setUp() {
        solution = new LargestNumber();
    }

    @Test
    public void testcase1() {
        int[] nums = {10, 2};
        String expected = "210";
        assertEquals(expected, solution.largestNumber(nums));
    }

    @Test
    public void testcase2() {
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        assertEquals(expected, solution.largestNumber(nums));
    }
}
