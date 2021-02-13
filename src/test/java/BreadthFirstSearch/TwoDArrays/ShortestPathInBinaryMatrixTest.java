package BreadthFirstSearch.TwoDArrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ShortestPathInBinaryMatrixTest {
    @Mock
    private ShortestPathInBinaryMatrix solution;

    @Before
    public void setUp() {
        solution = new ShortestPathInBinaryMatrix();
    }

    @Test
    public void testcase1() {
        int[][] grid = {{0, 1}, {1, 0}};
        int expected = 2;
        assertEquals(expected, solution.shortestPathBinaryMatrix(grid));
    }

    @Test
    public void testcase2() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int expected = 4;
        assertEquals(expected, solution.shortestPathBinaryMatrix(grid));
    }
}
