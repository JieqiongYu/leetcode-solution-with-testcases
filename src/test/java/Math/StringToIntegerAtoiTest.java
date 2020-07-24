package Math;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

    @Mock
    private StringToIntegerAtoi solution;

    @Before
    public void setUp() {
        solution = new StringToIntegerAtoi();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String input = "42";
        int expected = 42;
        assertEquals(expected, solution.myAtoi(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String input = "   -42";
        int expected = -42;
        assertEquals(expected, solution.myAtoi(input));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        String input = "4193 with words";
        int expected = 4193;
        assertEquals(expected, solution.myAtoi(input));
    }

    /**
     * Example 4.
     */
    @Test
    public void testcase4() {
        String input = "words and 987";
        int expected = 0;
        assertEquals(expected, solution.myAtoi(input));
    }

    /**
     * Example 5.
     */
    @Test
    public void testcase5() {
        String input = "-91283472332";
        int expected = -2147483648;
        assertEquals(expected, solution.myAtoi(input));
    }
}
