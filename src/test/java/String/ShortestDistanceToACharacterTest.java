package String;

import org.junit.*;
import org.mockito.Mock;

public class ShortestDistanceToACharacterTest {

    @Mock
    private ShortestDistanceToACharacter solution;

    public ShortestDistanceToACharacterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new ShortestDistanceToACharacter();
    }

    @After
    public void tearDown() {
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
