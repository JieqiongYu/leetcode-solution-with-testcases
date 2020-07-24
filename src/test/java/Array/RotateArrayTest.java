package Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class RotateArrayTest {

    @Mock
    private RotateArray solution;

    @Before
    public void setUp() {
        solution = new RotateArray();
    }

    @Test
    public void testcase1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};

        solution.rotate(nums, k);
        Assert.assertArrayEquals(expected, nums);
    }
}
