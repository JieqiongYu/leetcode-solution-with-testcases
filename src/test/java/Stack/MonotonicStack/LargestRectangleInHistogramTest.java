package Stack.MonotonicStack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LargestRectangleInHistogramTest {
    @Mock
    private LargestRectangleInHistogram solution;

    @Before
    public void setUp() {
        solution = new LargestRectangleInHistogram();
    }

    @Test
    public void testcase1() {
        int[] input = {2, 1, 5, 6, 2, 3};
        int expected = 10;
        assertEquals(expected, solution.largestRectangleArea(input));
    }

    @Test
    public void testcase2() {
        int[] input = {2, 4};
        int expected = 4;
        assertEquals(expected, solution.largestRectangleArea(input));
    }
}
