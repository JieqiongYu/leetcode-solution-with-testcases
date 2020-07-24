package DynamicProgramming;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Mock
    private Triangle solution;

    @Before
    public void setUp() {
        solution = new Triangle();
    }

    /**
     * Example 1
     */
    @Test
    public void testcase1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        int expected = 11;
        assertEquals(expected, solution.minimumTotal(triangle));
    }

}
