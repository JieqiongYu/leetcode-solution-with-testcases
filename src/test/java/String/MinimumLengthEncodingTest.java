package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MinimumLengthEncodingTest {
    @Mock
    private MinimumLengthEncoding solution;

    @Before
    public void setUp() {
        solution = new MinimumLengthEncoding();
    }

    @Test
    public void testcase1() {
        String[] words = {"time", "me", "bell"};
        int expected = 10;
        assertEquals(expected, solution.minimumLengthEncoding(words));
    }

    @Test
    public void testcase2() {
        String[] words = {"t"};
        int expected = 2;
        assertEquals(expected, solution.minimumLengthEncoding(words));
    }
}
