package Stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateStackSequencesTest {
    @Mock
    private ValidateStackSequences solution;

    @Before
    public void setUp() {
        solution = new ValidateStackSequences();
    }

    @Test
    public void testcase1() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    public void testcase2() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};
        assertFalse(solution.validateStackSequences(pushed, popped));
    }
}
