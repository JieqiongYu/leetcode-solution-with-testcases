package HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class PrisonAfterNDaysTest {

    @Mock
    private PrisonAfterNDays solution;

    @Before
    public void setUp() {
        solution = new PrisonAfterNDays();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int N = 7;
        int[] expected = {0, 0, 1, 1, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, solution.prisonAfterNDays(cells, N));
    }

    @Test
    public void testcase2() {
        int[] cells = {1, 0, 0, 1, 0, 0, 1, 0};
        int N = 1000000000;
        int[] expected = {0, 0, 1, 1, 1, 1, 1, 0};
        Assert.assertArrayEquals(expected, solution.prisonAfterNDays(cells, N));
    }
}
