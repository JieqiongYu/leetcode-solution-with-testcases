package BreadthFirstSearch.Graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

public class EvaluateDivisionTest {

    @Mock
    private EvaluateDivision solution;

    @Before
    public void setUp() {
        solution = new EvaluateDivision();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        List<List<String>> equation = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("b", "a"),
                Arrays.asList("a", "e"), Arrays.asList("a", "a"), Arrays.asList("x", "x"));
        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};
        Assert.assertArrayEquals(expected, solution.calcEquation(equation, values, queries), 1e-9);
    }

}
