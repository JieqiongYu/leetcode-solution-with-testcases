package MinMax;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NimGameTest {
    @Mock
    private NimGame solution;

    @Before
    public void setUp() {
        solution = new NimGame();
    }

    /**
     * Example 1
     */
    @Test
    public void testcase1() {
        int input = 4;
        assertFalse(solution.canWinNim(input));
    }

    /**
     * Example 2
     */
    @Test
    public void testcase2() {
        int input = 1;
        assertTrue(solution.canWinNim(input));
    }

    @Test
    public void testcase3() {
        int input = 2;
        assertTrue(solution.canWinNim(input));
    }
}
