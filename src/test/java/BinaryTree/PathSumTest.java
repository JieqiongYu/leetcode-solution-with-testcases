package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class PathSumTest {

    @Mock
    private PathSum solution;

    @Before
    public void setUp() {
        solution = new PathSum();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(
                Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1));
        int sum = 22;
        assertTrue(solution.hasPathSum1(root, sum));
    }
}
