package HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class TwoSumTest {

    @Mock
    private TwoSum solution;

    @Before
    public void setUp() {
        solution = new TwoSum();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
