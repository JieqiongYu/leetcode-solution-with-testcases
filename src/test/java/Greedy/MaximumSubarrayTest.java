package Greedy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {
    private MaximumSubarray solution;

    @Before
    public void setUp() {
        solution = new MaximumSubarray();
    }

    @Test
    public void testcase() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        assertEquals(expected, solution.maxSubArray(input));
    }
}
