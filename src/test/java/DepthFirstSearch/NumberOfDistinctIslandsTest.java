package DepthFirstSearch;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class NumberOfDistinctIslandsTest {
    @Mock
    private NumberOfDistinctIslands solution;

    @Before
    public void setUp() {
        solution = new NumberOfDistinctIslands();
    }

    @Test
    public void testcase1() {
        int[][] grid = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        int expected = 1;
        assertEquals(expected, solution.numDistinctIslands(grid));
    }

    @Test
    public void testcase2() {
        int[][] grid = {{1, 1, 0, 1, 1}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 1, 1}};
        int expected = 3;
        assertEquals(expected, solution.numDistinctIslands(grid));
    }
}
