package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertArrayEquals;

public class SquaresOfASortedArrayTest {

    @Mock
    private SquaresOfASortedArray solution;

    @Before
    public void setUp() {
        solution = new SquaresOfASortedArray();
    }

    @Test
    public void testcase1() {
        int[] A = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, solution.sortedSquares(A));
    }

    @Test
    public void testcase2() {
        int[] A = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, solution.sortedSquares(A));
    }
}
