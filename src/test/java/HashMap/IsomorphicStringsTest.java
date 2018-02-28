package HashMap;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

/**
 * Test for [LeetCode][205] Isomorphic Strings.
 *
 * @author jieqiong.yu
 */
public class IsomorphicStringsTest {
    
    @Mock
    private IsomorphicStrings solution;
    
    public IsomorphicStringsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        solution = new IsomorphicStrings();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String s = "egg";
        String t = "add";
        assertEquals(true, solution.isIsomorphic(s, t));
    }
    
    /**
     * Example 2. 
     */
    @Test
    public void testcase2() {
        String s = "foo";
        String t = "bar";
        assertEquals(false, solution.isIsomorphic(s, t));
    }
    
    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        String s = "paper";
        String t = "title";
        assertEquals(true, solution.isIsomorphic(s, t));
    }
    
    /**
     * Wrong case 1. 
     */
    @Test
    public void testcase4() {
        String s = "ab";
        String t = "aa";
        assertEquals(false, solution.isIsomorphic(s, t));
    }
}
