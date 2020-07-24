package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MultiplyStringTest {

    @Mock
    private MultiplyStrings solution;

    @Before
    public void setUp() {
        solution = new MultiplyStrings();
    }

    /**
     * Example.
     */
    @Test
    public void testcase1() {
        String num1 = "0";
        String num2 = "0";
        String expected = "0";
        assertEquals(expected, solution.multiply(num1, num2));
    }

    @Test
    public void testcase2() {
        String num1 = "6913259244";
        String num2 = "71103343";
        String expected = "491555843274052692";
        assertEquals(expected, solution.multiply(num1, num2));
    }
}
