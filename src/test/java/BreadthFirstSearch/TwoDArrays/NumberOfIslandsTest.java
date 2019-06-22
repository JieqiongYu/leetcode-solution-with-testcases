package BreadthFirstSearch.TwoDArrays;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {

    @Mock
    private NumberOfIslands solution;

    public NumberOfIslandsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new NumberOfIslands();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        int expected = 1;
        assertEquals(expected, solution.numIslands(grid));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
    }
}
