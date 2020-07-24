package DynamicProgramming;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    @Mock
    private EditDistance solution;

    @Before
    public void setUp() {
        solution = new EditDistance();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String input1 = "horse";
        String input2 = "ros";
        int expected = 3;
        assertEquals(expected, solution.minDistance(input1, input2));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String input1 = "intention";
        String input2 = "execution";
        int expected = 5;
        assertEquals(expected, solution.minDistance(input1, input2));
    }

}
