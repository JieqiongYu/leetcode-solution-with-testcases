package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ImageOverlapTest {
    @Mock
    private ImageOverlap solution;

    @Before
    public void setUp() {
        solution = new ImageOverlap();
    }

    @Test
    public void testcase1() {
        int[][] A = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] B = {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
        int expected = 3;
        assertEquals(expected, solution.largestOverlap(A, B));
    }
}
