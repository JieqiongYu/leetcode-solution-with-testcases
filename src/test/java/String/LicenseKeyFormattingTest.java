package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LicenseKeyFormattingTest {

    @Mock
    private LicenseKeyFormatting solution;

    @Before
    public void setUp() {
        solution = new LicenseKeyFormatting();
    }

    @Test
    public void testcase1() {
        String S = "5F3Z-2e-9-w";
        int K = 4;
        String expected = "5F3Z-2E9W";
        assertEquals(expected, solution.licenseKeyFormatting(S, K));
    }

    @Test
    public void testcase2() {
        String S = "2-5g-3-J";
        int K = 2;
        String expected = "2-5G-3J";
        assertEquals(expected, solution.licenseKeyFormatting(S, K));
    }
}
