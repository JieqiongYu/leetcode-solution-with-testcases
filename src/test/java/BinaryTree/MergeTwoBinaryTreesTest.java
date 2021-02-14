package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class MergeTwoBinaryTreesTest {
    @Mock
    private MergeTwoBinaryTrees solution;

    @Before
    public void setUp() {
        solution = new MergeTwoBinaryTrees();
    }

    @Test
    public void testcase1() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7));
        assertEquals(expected, solution.mergeTrees(root1, root2));
    }

    @Test
    public void testcase2() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Collections.singletonList(1));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 2));
        assertEquals(expected, solution.mergeTrees(root1, root2));
    }
}
