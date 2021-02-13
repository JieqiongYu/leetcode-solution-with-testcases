package TwoPointer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CamelcaseMatchingTest {
    @Mock
    private CamelcaseMatching solution;

    @Before
    public void setUp() {
        solution = new CamelcaseMatching();
    }

    @Test
    public void testcase1() {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        List<Boolean> expected = new ArrayList<>(Arrays.asList(true, false, true, true, false));
        assertEquals(expected, solution.camelMatch(queries, pattern));
    }

    @Test
    public void testcase2() {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FoBa";
        List<Boolean> expected = new ArrayList<>(Arrays.asList(true, false, true, false, false));
        assertEquals(expected, solution.camelMatch(queries, pattern));
    }

    @Test
    public void testcase3() {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FoBaT";
        List<Boolean> expected = new ArrayList<>(Arrays.asList(false, true, false, false, false));
        assertEquals(expected, solution.camelMatch(queries, pattern));
    }
}
