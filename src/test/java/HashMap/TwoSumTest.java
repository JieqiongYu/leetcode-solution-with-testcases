package HashMap;

import org.junit.*;
import org.mockito.Mock;

public class TwoSumTest {
    @Mock
    private TwoSum solution;


    public TwoSumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new TwoSum();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
