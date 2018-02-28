package Array;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Test for [LeetCode][189] Rotate Array.
 *
 * @author jieqiong.yu
 */
public class RotateArrayTest {
    
    @Mock
    private RotateArray solution;

    public RotateArrayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new RotateArray();
    }

    @After
    public void tearDown() {
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
