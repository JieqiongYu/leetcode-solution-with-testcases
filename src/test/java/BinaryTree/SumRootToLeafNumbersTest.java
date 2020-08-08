package BinaryTree;

import BinaryTree.SumRootToLeafNumbers;
import BinaryTree.TreeUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumRootToLeafNumbersTest {

    @Mock
    private SumRootToLeafNumbers solution;

    @Before
    public void setUp() {
        solution = new SumRootToLeafNumbers();
    }

    @Test
    public void testcase1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        int expected = 25;
        assertEquals(expected, solution.sumNumbers1(root));
    }
}
