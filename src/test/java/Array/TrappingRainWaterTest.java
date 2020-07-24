package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

    @Mock
    private TrappingRainWater solution;

    @Before
    public void setUp() {
        solution = new TrappingRainWater();
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, solution.trap(height));
    }
}
