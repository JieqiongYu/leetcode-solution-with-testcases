package Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

/**
 * Test for [LeetCode][844] Backspace String Compare
 *
 * @author jieqiong.yu
 */
public class BackspaceStringCompareTest {

  @Mock
  private BackspaceStringCompare solution;

  public BackspaceStringCompareTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    solution = new BackspaceStringCompare();
  }

  @After
  public void tearDown() {
  }

  /**
   * Example 1
   */
  @Test
  public void testcase1() {
    String s = "ab#c";
    String T = "ad#c";
    assertTrue(solution.backspaceCompare(s, T));
  }

  /**
   * Example 2
   */
  @Test
  public void testcase2() {
    String s = "ab##";
    String T = "c#d#";
    assertTrue(solution.backspaceCompare(s, T));
  }

  /**
   * Example 3
   */
  @Test
  public void testcase3() {
    String s = "a##c";
    String T = "#a#c";
    assertTrue(solution.backspaceCompare(s, T));
  }

  /**
   * Example 4
   */
  @Test
  public void testcase4() {
    String s = "a#c";
    String T = "b";
    assertTrue(solution.backspaceCompare(s, T));
  }
}
