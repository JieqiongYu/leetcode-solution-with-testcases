package DepthFirstSearch;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsGraphBipartiteTest {
    @Mock
    private IsGraphBipartite solution;

    @Before
    public void setUp() {
        solution = new IsGraphBipartite();
    }

    @Test
    public void testcase1() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        assertTrue(solution.isBipartite(graph));
    }

    @Test
    public void testcase2() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        assertFalse(solution.isBipartite(graph));
    }
}
