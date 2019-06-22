package BreadthFirstSearch.Graph;

import org.junit.*;
import org.mockito.Mock;

/**
 * Test for [LeetCode][399] Evaluate Division.
 *
 * @author jieqiong.yu
 */
public class EvaluateDivisionTest {

    @Mock
    private EvaluateDivision solution;

    public EvaluateDivisionTest(){
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new EvaluateDivision();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String[][] equation = {{"a", "b"}, {"b", "c"}};
        double[] values = {2.0, 3.0};
        String[][] queries = {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
        double[] expected =  {6.0, 0.5, -1.0, 1.0, -1.0};
        Assert.assertArrayEquals(expected, solution.calcEquation(equation, values, queries), 1e-9);
    }

}
