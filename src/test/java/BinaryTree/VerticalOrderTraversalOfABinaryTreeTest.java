package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VerticalOrderTraversalOfABinaryTreeTest {
    @Mock
    private VerticalOrderTraversalOfABinaryTree solution;

    @Before
    public void setUp() {
        solution = new VerticalOrderTraversalOfABinaryTree();
    }

    @Test
    public void testcase1() {
        TreeNode input = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(9),
                Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7));
        assertEquals(expected, solution.verticalTraversal(input));
    }

    @Test
    public void testcase2() {
        TreeNode input = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2),
                Arrays.asList(1, 5, 6), Arrays.asList(3), Arrays.asList(7));
        assertEquals(expected, solution.verticalTraversal(input));
    }

    @Test
    public void testcase3() {
        TreeNode input = TreeUtils.constructBinaryTree(
                Arrays.asList(0, 5, 1, 9, null, 2, null, null, null, null, 3, 4, 8, 6, null, null, null, 7));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(9, 7),
                Arrays.asList(5, 6), Arrays.asList(0, 2, 4), Arrays.asList(1, 3), Arrays.asList(8));
        assertEquals(expected, solution.verticalTraversal(input));
    }

    @Test
    public void testcase4() {
        TreeNode input = TreeUtils.constructBinaryTree(
                Arrays.asList(0, 2, 1, 3, null, null, null, 4, 5, null, 7, 6, null, 10, 8, 11, 9));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(4, 10, 11),
                Arrays.asList(3, 6, 7), Arrays.asList(2, 5, 8, 9), Arrays.asList(0),
                Arrays.asList(1));
        assertEquals(expected, solution.verticalTraversal(input));
    }
}
