package Array;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Mock
    private FindNumbersWithEvenNumberOfDigits solution;

    @Before
    public void setUp() {
        solution = new FindNumbersWithEvenNumberOfDigits();
    }

    @Test
    public void testcase1() {
        int[] nums = {12, 345, 2, 6, 7896};
        int expected = 2;
        assertEquals(expected, solution.findNumbers(nums));
    }

    @Test
    public void testcase2() {
        int[] nums = {555, 901, 482, 1771};
        int expected = 1;
        assertEquals(expected, solution.findNumbers(nums));
    }
}
