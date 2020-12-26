package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class FindNearestRightNodeInBinaryTreeTest {
    @Mock
    private FindNearestRightNodeInBinaryTree solution;

    @Before
    public void setUp() {
        solution = new FindNearestRightNodeInBinaryTree();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4, 5, 6));
        TreeNode u = new TreeNode(4);
        TreeNode expected = new TreeNode(5);

        assertEquals(expected.val, solution.findNearestRightNode(root, u).val);
    }

    @Test
    public void testcase2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, null, 4, 2));
        TreeNode u = new TreeNode(2);

        assertNull(solution.findNearestRightNode(root, u));
    }

    @Test
    public void testcase3() {
        TreeNode root = TreeUtils.constructBinaryTree(Collections.singletonList(1));
        TreeNode u = new TreeNode(1);

        assertNull(solution.findNearestRightNode(root, u));
    }

    @Test
    public void testcase4() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 2, null, null, null, 1));
        TreeNode u = new TreeNode(4);
        TreeNode expected = new TreeNode(2);

        assertEquals(expected.val, solution.findNearestRightNode(root, u).val);
    }
}
