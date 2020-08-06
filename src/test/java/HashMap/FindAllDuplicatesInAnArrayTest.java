package HashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindAllDuplicatesInAnArrayTest {
    private FindAllDuplicatesInAnArray solution;

    @Before
    public void setUp() {
        solution = new FindAllDuplicatesInAnArray();
    }

    @Test
    public void testcase1() {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        String expected = "[2, 3]";
        assertEquals(expected, solution.findDuplicates(input).toString());
    }

    @Test
    public void testcase2() {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1, 5, 5};
        String expected = "[2, 3, 5]";
        assertEquals(expected, solution.findDuplicates(input).toString());
    }
}
