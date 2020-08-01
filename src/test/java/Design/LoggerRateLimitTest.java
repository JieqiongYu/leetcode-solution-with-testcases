package Design;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoggerRateLimitTest {
    private LoggerRateLimit.Logger solution;

    @Before
    public void setUp() {
        solution = new LoggerRateLimit.Logger();
    }

    /**
     * Example
     */
    @Test
    public void testcase() {
        assertTrue(solution.shouldPrintMessage(1, "foo"));
        assertTrue(solution.shouldPrintMessage(2, "bar"));
        assertFalse(solution.shouldPrintMessage(3, "foo"));
        assertFalse(solution.shouldPrintMessage(8, "bar"));
        assertFalse(solution.shouldPrintMessage(10, "foo"));
        assertTrue(solution.shouldPrintMessage(11, "foo"));
    }
}
