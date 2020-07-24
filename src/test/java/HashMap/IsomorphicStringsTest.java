package HashMap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsomorphicStringsTest {

    @Mock
    private IsomorphicStrings solution;

    @Before
    public void setUp() {
        solution = new IsomorphicStrings();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String s = "egg";
        String t = "add";
        assertTrue(solution.isIsomorphic(s, t));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String s = "foo";
        String t = "bar";
        assertFalse(solution.isIsomorphic(s, t));
    }

    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        String s = "paper";
        String t = "title";
        assertTrue(solution.isIsomorphic(s, t));
    }

    /**
     * Wrong case 1.
     */
    @Test
    public void testcase4() {
        String s = "ab";
        String t = "aa";
        assertFalse(solution.isIsomorphic(s, t));
    }
}
