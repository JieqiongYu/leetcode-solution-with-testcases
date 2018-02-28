package String;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

/**
 * Test for [LeetCode][616] Add Bold Tag in String. 
 *
 * @author jieqiong.yu
 */
public class AddBoldTagInStringTest {
    
    @Mock
    private AddBoldTagInString solution;
    
    public AddBoldTagInStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        solution = new AddBoldTagInString();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testCase1() {
        String s = "abcxyz123";
        String[] dict = {"abc","123"};
        String expected = "<b>abc</b>xyz<b>123</b>";
        assertEquals(expected, solution.addBoldTag(s, dict));
    }
    
    /**
     * Example 2.
     */
    @Test
    public void testCase2() {
        String s = "aaabbcc";
        String[] dict = {"aaa","aab","bc"};
        String expected = "<b>aaabbc</b>c";
        assertEquals(expected, solution.addBoldTag(s, dict));
    }
}
