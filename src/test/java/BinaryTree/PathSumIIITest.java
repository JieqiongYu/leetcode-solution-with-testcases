package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PathSumIIITest {

    @Mock
    private PathSumIII solution;

    @Before
    public void setUp() {
        solution = new PathSumIII();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(
                Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1));
        int sum = 8;
        int expected = 3;
        assertEquals(expected, solution.pathSum(root, sum));
    }
}
