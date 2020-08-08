package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeInorderTraversalTest {

    @Mock
    private BinaryTreeInorderTraversal solution;

    @Before
    public void setUp() {
        solution = new BinaryTreeInorderTraversal();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, 3));
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, solution.inorderTraversal1(root));
    }

    @Test
    public void testcase2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2, 3));
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, solution.inorderTraversal2(root));
    }
}
