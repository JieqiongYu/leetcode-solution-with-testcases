package String;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class NextClosestTimeTest {
    @Mock
    private NextClosestTime solution;

    @Before
    public void setUp() {
        solution = new NextClosestTime();
    }

    @Test
    public void testcase1() {
        String time = "19:34";
        String expected = "19:39";
        assertEquals(expected, solution.nextClosestTime(time));
    }

    @Test
    public void testcase2() {
        String time = "23:59";
        String expected = "22:22";
        assertEquals(expected, solution.nextClosestTime(time));
    }
}
