package Math;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Mock
    private PalindromeNumber solution;

    public PalindromeNumberTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new PalindromeNumber();
    }

    @After
    public void tearDown() {
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
