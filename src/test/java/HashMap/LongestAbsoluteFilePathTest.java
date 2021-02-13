package HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class LongestAbsoluteFilePathTest {
    @Mock
    private LongestAbsoluteFilePath solution;

    @Before
    public void setUp() {
        solution = new LongestAbsoluteFilePath();
    }

    @Test
    public void testcase1() {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        int expected = 20;
        Assert.assertEquals(expected, solution.lengthLongestPath(input));
    }

    @Test
    public void testcase2() {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        int expected = 32;
        Assert.assertEquals(expected, solution.lengthLongestPath(input));
    }

    @Test
    public void testcase3() {
        String input = "a";
        int expected = 0;
        Assert.assertEquals(expected, solution.lengthLongestPath(input));
    }

    @Test
    public void testcase4() {
        String input = "file1.txt\nfile2.txt\nlongfile.txt";
        int expected = 12;
        Assert.assertEquals(expected, solution.lengthLongestPath(input));
    }
}
