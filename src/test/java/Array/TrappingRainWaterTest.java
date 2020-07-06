package Array;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {
    @Mock
    private TrappingRainWater solution;

    public TrappingRainWaterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new TrappingRainWater();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, solution.trap(height));
    }
}
