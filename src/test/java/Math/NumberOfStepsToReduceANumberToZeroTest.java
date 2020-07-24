package Math;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Mock
    private NumberOfStepsToReduceANumberToZero solution;

    @Before
    public void setUp() {
        solution = new NumberOfStepsToReduceANumberToZero();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int input = 14;
        int expected = 6;
        assertEquals(expected, solution.numberOfSteps(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int input = 8;
        int expected = 4;
        assertEquals(expected, solution.numberOfSteps(input));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        int input = 123;
        int expected = 12;
        assertEquals(expected, solution.numberOfSteps(input));
    }

}
