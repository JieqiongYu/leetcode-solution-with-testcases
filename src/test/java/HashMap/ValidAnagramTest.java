package HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {
    @Mock
    private ValidAnagram solution;

    @Before
    public void setUp() {
        solution = new ValidAnagram();
    }

    @Test
    public void testcase1() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testcase2() {
        String s = "rat";
        String t = "car";
        assertFalse(solution.isAnagram(s, t));
    }
}
