package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class GoatLatinTest {

  @Mock
  private GoatLatin solution;

  @Before
  public void setUp(){
    solution = new GoatLatin();
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
