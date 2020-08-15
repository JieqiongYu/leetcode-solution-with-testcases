package HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {
    @Mock
    private LongestPalindrome solution;

    @Before
    public void setUp() {
        solution = new LongestPalindrome();
    }

    @Test
    public void testcase1() {
        String s = "abccccdd";
        int expected = 7;
        assertEquals(expected, solution.longestPalindrome(s));
    }
}
