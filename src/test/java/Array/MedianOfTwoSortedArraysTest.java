package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Mock
    private MedianOfTwoSortedArrays solution;

    @Before
    public void setUp() {
        solution = new MedianOfTwoSortedArrays();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int[] input1 = {1, 3};
        int[] input2 = {2};
        double expected = 2.0;
        assertEquals(expected, solution.findMedianSortedArrays(input1, input2), 0.0);
    }

    /**
     * Example 2
     */
    @Test
    public void testcase2() {
        int[] input1 = {1, 2};
        int[] input2 = {3, 4};
        double expected = 2.5;
        assertEquals(expected, solution.findMedianSortedArrays(input1, input2), 0.0);
    }
}
