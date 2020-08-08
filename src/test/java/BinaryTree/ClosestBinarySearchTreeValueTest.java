package BinaryTree;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ClosestBinarySearchTreeValueTest {
    @Mock
    private ClosestBinarySearchTreeValue solution;

    @Before
    public void setUp() {
        solution = new ClosestBinarySearchTreeValue();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 5, 1, 3));
        double target = 3.714286;
        int expected = 4;
        assertEquals(expected, solution.closestValue(root, target));
    }
}
