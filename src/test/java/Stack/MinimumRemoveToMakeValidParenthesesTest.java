package Stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MinimumRemoveToMakeValidParenthesesTest {
    @Mock
    private MinimumRemoveToMakeValidParentheses solution;

    @Before
    public void setUp() {
        solution = new MinimumRemoveToMakeValidParentheses();
    }

    @Test
    public void testcase1() {
        String s = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";
        assertEquals(expected, solution.minRemoveToMakeValid(s));
    }

    @Test
    public void testcase2() {
        String s = "a)b(c)d";
        String expected = "ab(c)d";
        assertEquals(expected, solution.minRemoveToMakeValid(s));
    }

    @Test
    public void testcase3() {
        String s = "))((";
        String expected = "";
        assertEquals(expected, solution.minRemoveToMakeValid(s));
    }

    @Test
    public void testcase4() {
        String s = "(a(b(c)d)";
        String expected = "a(b(c)d)";
        assertEquals(expected, solution.minRemoveToMakeValid(s));
    }
}
