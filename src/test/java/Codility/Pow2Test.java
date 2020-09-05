package Codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Pow2Test {
    private Pow2 solution;

    @Before
    public void setUp() {
        solution = new Pow2();
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
