package DepthFirstSearch.Backtracking;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationsTest {

    @Mock
    private Combinations solution;

    @Before
    public void setUp() {
        solution = new Combinations();
    }

    @Test
    public void testcase1() {
        int n = 4;
        int k = 2;
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(1, 4), Arrays.asList(2, 3),
                Arrays.asList(2, 4), Arrays.asList(3, 4));
        assertEquals(expected, solution.combine(n, k));
    }
}
