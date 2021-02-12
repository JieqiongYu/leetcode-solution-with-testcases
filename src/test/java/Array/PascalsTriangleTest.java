package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleTest {
    @Mock
    private PascalsTriangle solution;

    @Before
    public void setUp() {
        solution = new PascalsTriangle();
    }

    @Test
    public void testcase1() {
        int input = 5;
        List<List<Integer>> expected = Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected, solution.generate(input));
    }
}
