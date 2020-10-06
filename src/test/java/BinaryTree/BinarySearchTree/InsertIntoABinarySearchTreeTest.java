package BinaryTree.BinarySearchTree;

import BinaryTree.TreeNode;
import BinaryTree.TreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;


public class InsertIntoABinarySearchTreeTest {
    @Mock
    private InsertIntoABinarySearchTree solution;

    @Before
    public void setUp() {
        solution = new InsertIntoABinarySearchTree();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        int val = 5;
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3, 5));
        Assert.assertEquals(expected, solution.insertIntoBST(root, val));
    }

    @Test
    public void testcase2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(40, 20, 60, 10, 30, 50, 70));
        int val = 25;
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(40, 20, 60, 10, 30, 50, 70, null, null, 25));
        Assert.assertEquals(expected, solution.insertIntoBST(root, val));
    }

    @Test
    public void testcase3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3, null, null, null, null, null, null));
        int val = 5;
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3, 5));
        Assert.assertEquals(expected, solution.insertIntoBST(root, val));
    }
}
