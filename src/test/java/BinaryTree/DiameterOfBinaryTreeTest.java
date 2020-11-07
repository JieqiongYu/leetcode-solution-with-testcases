package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DiameterOfBinaryTreeTest {
    @Mock
    private DiameterOfBinaryTree solution;

    @Before
    public void setUp() {
        solution = new DiameterOfBinaryTree();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 3;
        assertEquals(expected, solution.diameterOfBinaryTree(root));
    }


}
