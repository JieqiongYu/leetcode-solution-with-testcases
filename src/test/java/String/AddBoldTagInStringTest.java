package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class AddBoldTagInStringTest {

    @Mock
    private AddBoldTagInString solution;

    @Before
    public void setUp() {
        solution = new AddBoldTagInString();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String s = "abcxyz123";
        String[] dict = {"abc","123"};
        String expected = "<b>abc</b>xyz<b>123</b>";
        assertEquals(expected, solution.addBoldTag(s, dict));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String s = "aaabbcc";
        String[] dict = {"aaa","aab","bc"};
        String expected = "<b>aaabbc</b>c";
        assertEquals(expected, solution.addBoldTag(s, dict));
    }
}
