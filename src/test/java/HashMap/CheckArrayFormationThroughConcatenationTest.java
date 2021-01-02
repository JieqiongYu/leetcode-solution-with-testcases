package HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckArrayFormationThroughConcatenationTest {
    @Mock
    private CheckArrayFormationThroughConcatenation solution;

    @Before
    public void setUp() {
        solution = new CheckArrayFormationThroughConcatenation();
    }

    @Test
    public void testcase1() {
        int[] arr = {85};
        int[][] pieces = {{85}};
        assertTrue(solution.canFormArray(arr, pieces));
    }

    @Test
    public void testcase2() {
        int[] arr = {15, 88};
        int[][] pieces = {{88}, {15}};
        assertTrue(solution.canFormArray(arr, pieces));
    }

    @Test
    public void testcase3() {
        int[] arr = {49, 18, 16};
        int[][] pieces = {{16, 18, 49}};
        assertFalse(solution.canFormArray(arr, pieces));
    }

    @Test
    public void testcase4() {
        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{78}, {4, 64}, {91}};
        assertTrue(solution.canFormArray(arr, pieces));
    }

    @Test
    public void testcase5() {
        int[] arr = {1, 3, 5, 7};
        int[][] pieces = {{2, 4, 6, 8}};
        assertFalse(solution.canFormArray(arr, pieces));
    }
}
