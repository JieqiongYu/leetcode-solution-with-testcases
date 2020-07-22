package String;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Mock
    private LongestSubstringWithoutRepeatingCharacters solution;

    public LongestSubstringWithoutRepeatingCharactersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @After
    public void tearDown() {
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
