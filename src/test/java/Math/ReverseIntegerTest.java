package Math;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    @Mock
    private ReverseInteger solution;

    @Before
    public void setUp() {
        solution = new ReverseInteger();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int input = 123;
        int expected = 321;
        assertEquals(expected, solution.reverse(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int input = -123;
        int expected = -321;
        assertEquals(expected, solution.reverse(input));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        int input = 120;
        int expected = 21;
        assertEquals(expected, solution.reverse(input));
    }
}
