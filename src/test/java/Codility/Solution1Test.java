package Codility;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class Solution1Test {

    @Mock
    private Solution1 solution;

    @Before
    public void setUp() {
        solution = new Solution1();
    }

    @Test
    public void testcase1() {
        int[] input = {1, 4, 7, 3, 3, 5};
        int expected = 4;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase2() {
        int[] input = {0, 3, 3, 7, 5, 3, 11, 1};
        int expected = 7;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testcase3() {
        int[] input = {1};
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }
}
