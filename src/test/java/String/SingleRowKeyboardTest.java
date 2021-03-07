package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class SingleRowKeyboardTest {
    @Mock
    private SingleRowKeyboard solution;

    @Before
    public void setUp() {
        solution = new SingleRowKeyboard();
    }

    @Test
    public void testcase1() {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";
        int expected = 4;
        assertEquals(expected, solution.calculateTime(keyboard, word));
    }

    @Test
    public void testcase2() {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        int expected = 73;
        assertEquals(expected, solution.calculateTime(keyboard, word));
    }
}
