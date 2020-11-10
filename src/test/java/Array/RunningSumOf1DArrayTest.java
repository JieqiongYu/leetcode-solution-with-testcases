package Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOf1DArrayTest {
    @Mock
    private RunningSumOf1DArray solution;

    @Before
    public void setUp() {
        solution = new RunningSumOf1DArray();
    }

    @Test
    public void testcase1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testcase2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    public void testcase3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        assertArrayEquals(expected, solution.runningSum(nums));
    }
}
