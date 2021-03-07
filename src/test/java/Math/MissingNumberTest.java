package Math;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    @Mock
    private MissingNumber solution;

    @Before
    public void setUp() {
        solution = new MissingNumber();
    }

    @Test
    public void testcase1() {
        int[] nums = {3, 0, 1};
        int expected = 2;
        assertEquals(expected, solution.missingNumber(nums));
    }

    @Test
    public void testcase2() {
        int[] nums = {0, 1};
        int expected = 2;
        assertEquals(expected, solution.missingNumber(nums));
    }

    @Test
    public void testcase3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        assertEquals(expected, solution.missingNumber(nums));
    }

    @Test
    public void testcase4() {
        int[] nums = {0};
        int expected = 1;
        assertEquals(expected, solution.missingNumber(nums));
    }
}
