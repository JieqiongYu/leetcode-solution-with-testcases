package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class CompareVersionNumbersTest {
    @Mock
    private CompareVersionNumbers solution;

    @Before
    public void setUp() {
        solution = new CompareVersionNumbers();
    }

    @Test
    public void testcase1() {
        String version1 = "0.1";
        String version2 = "1.1";
        int expected = -1;
        assertEquals(expected, solution.compareVersion(version1, version2));
    }

    @Test
    public void testcase2() {
        String version1 = "1.0.1";
        String version2 = "1";
        int expected = 1;
        assertEquals(expected, solution.compareVersion(version1, version2));
    }

    @Test
    public void testcase3() {
        String version1 = "7.5.2.4";
        String version2 = "7.5.3";
        int expected = -1;
        assertEquals(expected, solution.compareVersion(version1, version2));
    }

    @Test
    public void testcase4() {
        String version1 = "1.01";
        String version2 = "1.001";
        int expected = 0;
        assertEquals(expected, solution.compareVersion(version1, version2));
    }

    @Test
    public void testcase5() {
        String version1 = "1.0";
        String version2 = "1.0.0";
        int expected = 0;
        assertEquals(expected, solution.compareVersion(version1, version2));
    }
}
