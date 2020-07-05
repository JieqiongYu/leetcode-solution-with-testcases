package Design;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    @Mock
    private LRUCache solution;

    public LRUCacheTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Example: LRUCache cache = new LRUCache(2);
        solution = new LRUCache(2);
    }

    @After
    public void tearDown() {
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        // cache.put(1,1);
        solution.put(1, 1);
        // cache.put(2,2);
        solution.put(2, 2);
        // cache.get(1);
        int expected1 = 1;
        assertEquals(expected1, solution.get(1));
        // cache.put(3,3); // evicts key 2
        solution.put(3, 3);
        // cache.get(2); // returns -1 (not found)
        int expected2 = -1;
        assertEquals(expected2, solution.get(2));
        // cache.put(4,4); // evicts key 1
        solution.put(4, 4);
        // cache.get(!); // return -1 (not found)
        int expected3 = -1;
        assertEquals(expected3, solution.get(1));
        // cache.get(3); // return 3
        int expected4 = 3;
        assertEquals(expected4, solution.get(3));
        // cache.get(4); // returns 4
        int expected5 = 4;
        assertEquals(expected5, solution.get(4));
    }
}
