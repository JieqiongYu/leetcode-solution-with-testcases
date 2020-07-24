package Stack;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BackspaceStringCompareTest {

  @Mock
  private BackspaceStringCompare solution;

  @Before
  public void setUp() {
    solution = new BackspaceStringCompare();
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
    assertFalse(solution.backspaceCompare(s, T));
  }
}
