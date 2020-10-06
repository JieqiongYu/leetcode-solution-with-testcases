package Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class DuplicateZerosTest {
    @Mock
    private DuplicateZeros solution;

    @Before
    public void setUp() {
        solution = new DuplicateZeros();
    }

    @Test
    public void testcase1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void testcase2() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        solution.duplicateZeros(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void testcase3() {
        int[] arr = {1, 0, 7, 2, 4, 3, 1, 0, 2, 6};
        int[] expected = {1, 0, 0, 7, 2, 4, 3, 1, 0, 0};
        solution.duplicateZeros(arr);
        Assert.assertArrayEquals(expected, arr);
    }
}
