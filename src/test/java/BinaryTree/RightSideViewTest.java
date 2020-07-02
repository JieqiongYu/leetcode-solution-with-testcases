package BinaryTree;

import org.junit.*;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RightSideViewTest {

    @Mock
    private RightSideView solution;

    public RightSideViewTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new RightSideView();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        TreeNode input = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 5, null, 4));
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, solution.rightSideView(input));
    }
}
