package String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetectCapitalTest {
    private DetectCapital solution;

    @Before
    public void setUp() {
        solution = new DetectCapital();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String input = "USA";
        assertTrue(solution.detectCapitalUse(input));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String input = "FlaG";
        assertFalse(solution.detectCapitalUse(input));
    }
}
