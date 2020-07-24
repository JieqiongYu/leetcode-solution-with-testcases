package Math;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Mock
    private PalindromeNumber solution;

    @Before
    public void setUp() {
        solution = new PalindromeNumber();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int input = 121;
        assertTrue(solution.isPalindrome(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int input = -121;
        assertFalse(solution.isPalindrome(input));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        int input = 10;
        assertFalse(solution.isPalindrome(input));
    }
}
