package String;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ReorderDataInLogFilesTest {

    @Mock
    private ReorderDataInLogFiles solution;

    @Before
    public void setUp() {
        solution = new ReorderDataInLogFiles();
    }

    /**
     * Example 1
     */
    @Test
    public void testcase1() {
        String[] logs = new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expected = new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        Assert.assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }

    /**
     * Example 2
     */
    @Test
    public void testcase2() {
        String[] logs = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
        String[] expected = new String[]{"a2 act car", "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        Assert.assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }
}
