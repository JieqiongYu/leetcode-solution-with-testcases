package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class RemoveOutermostParenthesesTest {

    @Mock
    private RemoveOutermostParentheses solution;

    @Before
    public void setUp() {
        solution = new RemoveOutermostParentheses();
    }

    @Test
    public void testcase1() {
        String S = "(()())(())";
        String expected = "()()()";
        assertEquals(expected, solution.removeOuterParentheses(S));
    }

    @Test
    public void testcase2() {
        String S = "(()())(())(()(()))";
        String expected = "()()()()(())";
        assertEquals(expected, solution.removeOuterParentheses(S));
    }

    @Test
    public void testcase3() {
        String S = "()()";
        String expected = "";
        assertEquals(expected, solution.removeOuterParentheses(S));
    }
}
