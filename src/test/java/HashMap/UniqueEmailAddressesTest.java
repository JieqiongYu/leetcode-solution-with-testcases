package HashMap;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressesTest {

    @Mock
    private UniqueEmailAddresses solution;

    public UniqueEmailAddressesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new UniqueEmailAddresses();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String[] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int expected = 2;
        assertEquals(expected, solution.numUniqueEmails(input));
    }

    /**
     * Example 2.
     * ["testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"]
     */
    @Test
    public void testcase2() {
        String[] input = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        int expected = 3;
        assertEquals(expected, solution.numUniqueEmails(input));
    }
}
