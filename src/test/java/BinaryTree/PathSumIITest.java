package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PathSumIITest {
    @Mock
    private PathSumII solution;

    @Before
    public void setUp() {
        solution = new PathSumII();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(
                Arrays.asList(
                        5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        int sum = 22;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 4, 11, 2), Arrays.asList(5, 8, 4, 5));
        assertEquals(expected, solution.pathSum(root, sum));
    }
}
