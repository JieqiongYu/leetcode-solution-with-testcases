package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaximumDistanceInArraysTest {

    @Mock
    private MaximumDistanceInArrays solution;

    @Before
    public void setUp() {
        solution = new MaximumDistanceInArrays();
    }

    @Test
    public void testcase1() {
        List<List<Integer>> arrays = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(1, 2, 3));
        int expected = 4;
        assertEquals(expected, solution.maxDistance(arrays));
    }
}
