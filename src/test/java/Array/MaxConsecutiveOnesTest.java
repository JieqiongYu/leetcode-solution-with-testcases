package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Mock
    public MaxConsecutiveOnes solution;

    @Before
    public void setUp() {
        solution = new MaxConsecutiveOnes();
    }

    @Test
    public void testcase1() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int expected = 3;
        assertEquals(expected, solution.findMaxConsecutiveOnes(nums));
    }
}
