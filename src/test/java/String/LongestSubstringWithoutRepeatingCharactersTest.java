package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Mock
    private LongestSubstringWithoutRepeatingCharacters solution;

    @Before
    public void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }


    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String input = "abcabcbb";
        int expected = 3;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String input = "bbbbb";
        int expected = 1;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        String input = "pwwkew";
        int expected = 3;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }
}
