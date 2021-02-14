package Design;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MovingAverageTest {
    @Mock
    private MovingAverage solution;

    @Before
    public void setUp() {
        solution = new MovingAverage(3);
    }

    @Test
    public void testcase1() {
        double expected1 = 1.0;
        assertEquals(expected1, solution.next(1), 0);
        double expected2 = 5.5;
        assertEquals(expected2, solution.next(10), 0);
        double expected3 = 4.66667;
        assertEquals(expected3, solution.next(3), 0);
        double expected4 = 6.0;
        assertEquals(expected4, solution.next(5), 0);
    }
}
