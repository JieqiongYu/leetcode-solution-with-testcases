package BinaryTree.BinarySearchTree;

import BinaryTree.TreeNode;
import BinaryTree.TreeUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RangeSumOfBSTTest {
    @Mock
    private RangeSumOfBST solution;

    @Before
    public void setUp() {
        solution = new RangeSumOfBST();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, null, 18));
        int low = 7;
        int high = 15;
        int expected = 32;
        assertEquals(expected, solution.rangeSumBST(root, low, high));
    }

    @Test
    public void testcase2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6));
        int low = 6;
        int high = 10;
        int expected = 23;
        assertEquals(expected, solution.rangeSumBST(root, low, high));
    }
}
