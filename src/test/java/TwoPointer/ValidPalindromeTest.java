package TwoPointer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    private ValidPalindrome solution;

    @Before
    public void setUp() {
        solution = new ValidPalindrome();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(input, solution.isPalindrome(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String input = "race a car";
        assertFalse(input, solution.isPalindrome(input));
    }
}
