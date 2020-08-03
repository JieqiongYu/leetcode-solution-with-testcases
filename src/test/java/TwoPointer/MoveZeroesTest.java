package TwoPointer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {
    private MoveZeroes solution;

    @Before
    public void setUp() {
        solution = new MoveZeroes();
    }

    @Test
    public void testcase() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}
