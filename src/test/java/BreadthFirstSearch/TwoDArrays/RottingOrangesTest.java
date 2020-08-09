package BreadthFirstSearch.TwoDArrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class RottingOrangesTest {

    @Mock
    private RottingOranges solution;

    @Before
    public void setUp() {
        solution = new RottingOranges();
    }

    @Test
    public void testcase1() {
        int[][] grid = {{2, 1, 1,}, {1, 1, 0}, {0, 1, 1}};
        int expected = 4;
        assertEquals(expected, solution.orangesRotting(grid));
    }

    @Test
    public void testcase2() {
        int[][] grid = {{2, 1, 1,}, {0, 1, 1}, {1, 0, 1}};
        int expected = -1;
        assertEquals(expected, solution.orangesRotting(grid));
    }

    @Test
    public void testcase3() {
        int[][] grid = {{0, 2}};
        int expected = 0;
        assertEquals(expected, solution.orangesRotting(grid));
    }
}
