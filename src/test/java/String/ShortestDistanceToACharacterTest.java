package String;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ShortestDistanceToACharacterTest {

    @Mock
    private ShortestDistanceToACharacter solution;

    @Before
    public void setUp() {
        solution = new ShortestDistanceToACharacter();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String s = "loveleetcode";
        char c = 'e';
        int[] expected = {3,2,1,0,1,0,0,1,2,2,1,0};
        int[] result = solution.shortestToChar(s,c);
        Assert.assertArrayEquals(expected, result);
    }
}
