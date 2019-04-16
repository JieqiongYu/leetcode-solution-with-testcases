package DynamicProgramming;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.Mock;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TriangleTest {

    @Mock
    private Triangle solution;

    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new Triangle();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1
     */
    @Test
    public void testcase1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        int expected = 11;
        assertEquals(expected, solution.minimumTotal(triangle));
    }

}
