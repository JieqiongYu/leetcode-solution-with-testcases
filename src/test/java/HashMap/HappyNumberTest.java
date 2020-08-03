package HashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    private HappyNumber solution;

    @Before
    public void setUp() {
        solution = new HappyNumber();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        int input = 19;
        assertTrue(solution.isHappy(input));
    }
}
