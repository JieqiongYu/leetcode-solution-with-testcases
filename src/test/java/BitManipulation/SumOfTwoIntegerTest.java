package BitManipulation;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class SumOfTwoIntegerTest {

    @Mock
    private SumOfTwoInteger solution;

    public SumOfTwoIntegerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new SumOfTwoInteger();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int a = 1;
        int b = 2;
        int expected = 3;
        assertEquals(expected, solution.getSum(a, b));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        int a = -2;
        int b = 3;
        int expected = 1;
        assertEquals(expected, solution.getSum(a, b));
    }
}
