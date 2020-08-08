package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class SubarraySumEqualsKTest {
    @Mock
    private SubarraySumEqualsK solution;

    @Before
    public void setUp() {
        solution = new SubarraySumEqualsK();
    }

    @Test
    public void testcase1() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int expected = 2;
        assertEquals(expected, solution.subarraySum(nums, k));
    }

}
