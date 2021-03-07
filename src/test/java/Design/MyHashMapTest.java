package Design;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    @Mock
    private MyHashMap solution;

    @Before
    public void setUp() {
        solution = new MyHashMap();
    }

    @Test
    public void testcase1() {
        solution = new MyHashMap();
        solution.put(1, 1);
        solution.put(2, 2);
        int expected1 = 1;
        assertEquals(expected1, solution.get(1));
        int expected2 = -1;
        assertEquals(expected2, solution.get(3));
        solution.put(2, 1);
        int expected3 = 1;
        assertEquals(expected3, solution.get(2));
        solution.remove(2);
        int expected4 = -1;
        assertEquals(expected4, solution.get(2));
    }
}
