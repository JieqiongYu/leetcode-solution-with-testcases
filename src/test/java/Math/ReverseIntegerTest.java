package Math;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    @Mock
    private ReverseInteger solution;

    public ReverseIntegerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new ReverseInteger();
    }

    @After
    public void tearDown() {
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
