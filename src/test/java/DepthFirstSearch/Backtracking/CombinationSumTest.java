package DepthFirstSearch.Backtracking;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

    @Mock
    private CombinationSum solution;

    @Before
    public void setUp() {
        solution = new CombinationSum();
    }

    @Test
    public void testcase1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 3), Collections.singletonList(7));
        assertEquals(expected, solution.combinationSum(candidates, target));
    }

    @Test
    public void testcase2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5));
        assertEquals(expected, solution.combinationSum(candidates, target));
    }

    @Test
    public void testcase3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, solution.combinationSum(candidates, target));
    }

    @Test
    public void testcase4() {
        int[] candidates = {1};
        int target = 1;
        List<List<Integer>> expected = Collections.singletonList(Collections.singletonList(1));
        assertEquals(expected, solution.combinationSum(candidates, target));
    }

    @Test
    public void testcase5() {
        int[] candidates = {1};
        int target = 2;
        List<List<Integer>> expected = Collections.singletonList(Arrays.asList(1, 1));
        assertEquals(expected, solution.combinationSum(candidates, target));
    }

}
