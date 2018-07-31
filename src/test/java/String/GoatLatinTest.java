package String;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;


/**
 * Test for [LeetCode 824] Goat Latin.
 *
 * @author jieqiong.yu
 */
public class GoatLatinTest {

  @Mock
  private GoatLatin solution;

  public GoatLatinTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass(){
  }

  @Before
  public void setUp(){
    solution = new GoatLatin();
  }

  @After
  public void teadDown(){
  }

  /**
   * Example 1
   */
  @Test
  public void testcase1() {
    String input =  "I speak Goat Latin";
    String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
    assertEquals(expected, solution.toGoatLatin(input));
  }

  /**
   * Example 2
   */
  @Test
  public void testcase2() {
    String input = "The quick brown fox jumped over the lazy dog";
    String expected = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
    assertEquals(expected, solution.toGoatLatin(input));
  }


}
