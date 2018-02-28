package String;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

/**
 * Test for [LeetCode][43] Multiply Strings. 
 *
 * @author jieqiong.yu
 */
public class MultiplyStringTest {
    
    @Mock 
    private MultiplyStrings solution;
    
    public MultiplyStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        solution = new MultiplyStrings();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Example.
     */
    @Test
    public void testcase1() {
        String num1 = "0";
        String num2 = "0";
        String expected = "0";
        assertEquals(expected, solution.multiply(num1, num2));
    }
    
    @Test 
    public void testcase2() {
        String num1 = "6913259244";
        String num2 = "71103343";
        String expected = "491555843274052692";
        assertEquals(expected, solution.multiply(num1, num2));
    }
}
