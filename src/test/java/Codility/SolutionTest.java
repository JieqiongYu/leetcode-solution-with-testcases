package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testcase1() {
        int[] input = {1,0,0,1,1};
        int[] expected = {1,0,1};
        assertArrayEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase2() {
        int[] input = {1,0,0,1,1,1};
        int[] expected = {1,0,1,0,1,1};
        assertArrayEquals(expected, solution.solution(input));
    }
}
