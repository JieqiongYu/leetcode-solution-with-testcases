package TwoPointer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class MergeSortedArrayTest {

    @Mock
    private MergeSortedArray solution;

    @Before
    public void setUp() {
        solution = new MergeSortedArray();
    }

    @Test
    public void testcase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expected, nums1);
    }
}
