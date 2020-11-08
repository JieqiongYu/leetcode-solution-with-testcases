package TwoPointer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class TwoSumLessThanKTest {
    @Mock
    private TwoSumLessThanK solution;

    @Before
    public void setUp() {
        solution = new TwoSumLessThanK();
    }

    @Test
    public void testcase1() {
        int[] A = {34, 23, 1, 24, 75, 33, 54, 8};
        int K = 60;
        int expected = 58;
        assertEquals(expected, solution.twoSumLessThanK(A, K));
    }

    @Test
    public void testcase2() {
        int[] A = {10, 20, 30};
        int K = 15;
        int expected = -1;
        assertEquals(expected, solution.twoSumLessThanK(A, K));
    }
}
