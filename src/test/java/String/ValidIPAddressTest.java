package String;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;


public class ValidIPAddressTest {

    @Mock
    private ValidIPAddress solution;

    public ValidIPAddressTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new ValidIPAddress();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     * Input: "172.16.254.1"
     * Output: "IPv4"
     * Explanation: This is a valid IPv4 address, return "IPv4".
     */
    @Test
    public void testcase1() {
        String input = "172.16.254.1";
        String expected = "IPv4";
        assertEquals(expected, solution.validIPAddress(input));
    }

    /**
     * Example 2.
     * Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"
     * Output: "IPv6"
     * Explanation: This is a valid IPv6 address, return "IPv6".
     */
    @Test
    public void testcase2() {
        String input = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String expected = "IPv6";
        assertEquals(expected, solution.validIPAddress(input));
    }

    /**
     * Example 3.
     * Input: "256.256.256.256"
     * Output: "Neither"
     * Explanation: This is neither a IPv4 address nor a IPv6 address.
     */
    @Test
    public void testcase3() {
        String input = "256.256.256.256";
        String expected = "Neither";
        assertEquals(expected, solution.validIPAddress(input));
    }

    /**
     * Example 4.
     * Input: "01.01.01.01"
     * Output: "Neither"
     */
    @Test
    public void testcase4() {
        String input = "01.01.01.01";
        String expected = "Neither";
        assertEquals(expected, solution.validIPAddress(input));
    }
}
