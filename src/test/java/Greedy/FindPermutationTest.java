package Greedy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class FindPermutationTest {

    @Mock
    private FindPermutation solution;

    @Before
    public void setUp() {
        solution = new FindPermutation();
    }

    @Test
    public void testcase1() {
        String s = "I";
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.findPermutation(s));
    }

    @Test
    public void testcase2() {
        String s = "DI";
        int[] expected = {2, 1, 3};
        assertArrayEquals(expected, solution.findPermutation(s));
    }
}
