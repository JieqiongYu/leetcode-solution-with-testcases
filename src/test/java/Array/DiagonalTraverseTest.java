package Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class DiagonalTraverseTest {
    @Mock
    private DiagonalTraverse solution;

    @Before
    public void setUp() {
        solution = new DiagonalTraverse();
    }

    @Test
    public void testcase1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        Assert.assertArrayEquals(expected, solution.findDiagonalOrder(matrix));
    }
}
