package String;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LongestPalindromeSubstringTest {
    @Mock
    public LongestPalindromeSubstring solution;

    public LongestPalindromeSubstringTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new LongestPalindromeSubstring();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1
     */
    @Test
    public void testcase1() {
        String input = "babad";
        String expected1 = "bab";
        String expected2 = "aba";
        assertTrue(expected1.equals(solution.longestPalindrome(input)) || expected2.equals(solution.longestPalindrome(input)));
    }

    /**
     * Example 2
     * The corner case where
     * start should be i - (len - 1)/2;
     * not i - len / 2;
     */
    @Test
    public void testcase2() {
        String input = "cbbd";
        String expected = "bb";
        assertEquals(expected, solution.longestPalindrome(input));
    }

    /**
     * Example 3
     */
    @Test
    public void testcase3() {
        String input = "racecar";
        String expected = "racecar";
        assertEquals(expected, solution.longestPalindrome(input));
    }

    /**
     * Example 4
     */
    @Test
    public void testcase4() {
        String input = "bbbbaabbbb";
        String expected = "bbbbaabbbb";
        assertEquals(expected, solution.longestPalindrome(input));
    }
}
