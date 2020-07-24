package BitManipulation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class SumOfTwoIntegerTest {

    @Mock
    private SumOfTwoInteger solution;

    @Before
    public void setUp() {
        solution = new SumOfTwoInteger();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int a = 1;
        int b = 2;
        int expected = 3;
        assertEquals(expected, solution.getSum(a, b));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int a = -2;
        int b = 3;
        int expected = 1;
        assertEquals(expected, solution.getSum(a, b));
    }
}
