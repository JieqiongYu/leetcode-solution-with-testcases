package TwoPointer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class KDiffPairsInAnArrayTest {
    @Mock
    private KDiffPairsInAnArray solution;

    @Before
    public void setUp() {
        solution = new KDiffPairsInAnArray();
    }

    @Test
    public void testcase1() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        int expected = 2;
        assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void testcase2() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        int expected = 4;
        assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void testcase3() {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        int expected = 1;
        assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void testcase4() {
        int[] nums = {1, 2, 4, 4, 3, 3, 0, 9, 2, 3};
        int k = 3;
        int expected = 2;
        assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void testcase5() {
        int[] nums = {-1, -2, -3};
        int k = 1;
        int expected = 2;
        assertEquals(expected, solution.findPairs(nums, k));
    }
}
