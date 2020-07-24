package BinarySearch;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ArrangeCoinsTest {

    @Mock
    private ArrangeCoins solution;

    @Before
    public void setUp() {
        solution = new ArrangeCoins();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int n = 5;
        int expected = 2;
        assertEquals(expected, solution.arrangeCoins(n));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int n = 8;
        int expected = 3;
        assertEquals(expected, solution.arrangeCoins(n));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        int n = 6;
        int expected = 3;
        assertEquals(expected, solution.arrangeCoins(n));
    }

    /**
     * Example 4.
     */
    @Test
    public void testcase4() {
        int n = 1804289383;
        int expected = 60070;
        assertEquals(expected, solution.arrangeCoins(n));
    }
}
