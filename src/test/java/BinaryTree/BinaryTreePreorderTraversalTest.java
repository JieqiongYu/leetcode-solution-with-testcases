package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreePreorderTraversalTest {

    @Mock
    private BinaryTreePreorderTraversal solution;

    @Before
    public void setUp() {
        solution = new BinaryTreePreorderTraversal();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(
                Arrays.asList(1, null, 2, 3));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.preorderTraversal1(root));
    }

    @Test
    public void testcase2() {
        TreeNode root = TreeUtils.constructBinaryTree(
                Arrays.asList(1, null, 2, 3));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.preorderTraversal2(root));
    }
}
