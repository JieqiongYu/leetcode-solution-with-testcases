package HashMap;

import org.junit.*;
import org.mockito.Mock;


/**
 * Test for [LeetCode][957] Prison Cells After N Days.
 * https://leetcode.com/problems/prison-cells-after-n-days/
 */
public class PrisonAfterNDaysTest {
    @Mock
    private PrisonAfterNDays solution;

    public PrisonAfterNDaysTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new PrisonAfterNDays();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int N = 7;
        int[] expected = {0, 0, 1, 1, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, solution.prisonAfterNDays(cells, N));
    }

    @Test
    public void testcase2() {
        int[] cells = {1, 0, 0, 1, 0, 0, 1, 0};
        int N = 1000000000;
        int[] expected = {0, 0, 1, 1, 1, 1, 1, 0};
        Assert.assertArrayEquals(expected, solution.prisonAfterNDays(cells, N));
    }
}
