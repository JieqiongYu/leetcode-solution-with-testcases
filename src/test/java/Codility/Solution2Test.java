package Codility;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Mock
    private Solution2 solution;

    @Before
    public void setUp() {
        solution = new Solution2();
    }

    @Test
    public void testcase1() {
        int[] input = {4, 2, 2, 4, 2};
        int expected = 5;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase2() {
        int[] input = {1, 2, 3, 2};
        int expected = 3;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase3() {
        int[] input = {0, 5, 4, 4, 5, 12};
        int expected = 4;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase4() {
        int[] input = {4, 4};
        int expected = 2;
        assertEquals(expected, solution.solution(input));
    }
}
