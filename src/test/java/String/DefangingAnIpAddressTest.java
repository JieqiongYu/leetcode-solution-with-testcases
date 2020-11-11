package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class DefangingAnIpAddressTest {
    @Mock
    private DefangingAnIpAddress solution;

    @Before
    public void setUp() {
        solution = new DefangingAnIpAddress();
    }

    @Test
    public void testcase1() {
        String input = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, solution.defangIPaddr(input));
    }

    @Test
    public void testcase2() {
        String input = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        assertEquals(expected, solution.defangIPaddr(input));
    }
}
