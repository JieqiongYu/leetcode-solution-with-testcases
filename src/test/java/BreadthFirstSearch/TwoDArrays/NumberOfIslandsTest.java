package BreadthFirstSearch.TwoDArrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {

    @Mock
    private NumberOfIslands solution;

    @Before
    public void setUp() {
        solution = new NumberOfIslands();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        int expected = 1;
        assertEquals(expected, solution.numIslands(grid));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        int expected = 3;
        assertEquals(expected, solution.numIslands(grid));
    }
}
