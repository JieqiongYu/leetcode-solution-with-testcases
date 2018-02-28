package Math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Test for [LeetCode][645] Set Mismatch
 *
 * @author jieqiong.yu
 */
public class SetMismatchTest {
    
    @Mock
    private SetMismatch solution;
    
    public SetMismatchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        solution = new SetMismatch();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Example.
     */
    @Test
    public void testcase1() {
        int[] nums = {1,2,2,4};
        int[] expected = {2,3};
        Assert.assertArrayEquals(expected, solution.findErrorNums(nums));
    }
    
    /**
     * Wrong scenario 1. 
     */
    @Test
    public void testcase2() {
        int[] nums = {2,2};
        int[] expected = {2,1};
        Assert.assertArrayEquals(expected,solution.findErrorNums(nums));
    }
    
    /**
     * Wrong scenario 2. 
     */
    @Test
    public void testcase3() {
        int[] nums = {3,2,2};
        int[] expected = {2,1};
        Assert.assertArrayEquals(expected,solution.findErrorNums(nums));
    }
    
    @Test
    public void testcase4() {
        int[] nums = {1,1};
        int[] expected = {1,2};
        Assert.assertArrayEquals(expected,solution.findErrorNums(nums));
    }
    
    @Test
    public void testcase5() {
        int[] nums = {3,2,3,4,6,5};
        int[] expected = {3,1};
        Assert.assertArrayEquals(expected,solution.findErrorNums(nums));
    }
}
