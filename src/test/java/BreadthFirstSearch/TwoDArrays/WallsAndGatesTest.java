package BreadthFirstSearch.TwoDArrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertArrayEquals;

public class WallsAndGatesTest {
    @Mock
    private WallsAndGates solution;

    @Before
    public void setUp() {
        solution = new WallsAndGates();
    }

    @Test
    public void testcase1() {
        int INF = Integer.MAX_VALUE;
        int[][] rooms = {
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF}
        };

        solution.wallsAndGates(rooms);
        int[][] expected = {
                {3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };

        assertArrayEquals(expected, rooms);

    }
}
