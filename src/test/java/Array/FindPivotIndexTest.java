package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class FindPivotIndexTest {

    @Mock
    private FindPivotIndex solution;

    @Before
    public void setUp() {
        solution = new FindPivotIndex();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        assertEquals(expected, solution.pivotIndex(nums));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int[] nums = {1, 2, 3};
        int expected = -1;
        assertEquals(expected, solution.pivotIndex(nums));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        int[] nums = {-1, -1, -1, -1, -1, -1};
        int expected = -1;
        assertEquals(expected, solution.pivotIndex(nums));
    }

    /**
     * Example 4.
     */
    @Test
    public void testcase4() {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        int expected = 0;
        assertEquals(expected, solution.pivotIndex(nums));
    }
}
