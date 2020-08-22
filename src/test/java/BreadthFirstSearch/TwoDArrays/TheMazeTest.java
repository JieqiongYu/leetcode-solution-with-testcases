package BreadthFirstSearch.TwoDArrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TheMazeTest {
    @Mock
    public TheMaze solution;

    @Before
    public void setUp() {
        solution = new TheMaze();
    }

    @Test
    public void testcase1() {
        int[][] maze = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
        };
        int[] start = {0, 4};
        int[] destination = {4, 4};
        assertTrue(solution.hasPath(maze, start, destination));
    }

    @Test
    public void testcase2() {
        int[][] maze = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1,},
                {0, 0, 0, 0, 0},
        };
        int[] start = {0, 4};
        int[] destination = {3, 2};
        assertFalse(solution.hasPath(maze, start, destination));
    }
}
