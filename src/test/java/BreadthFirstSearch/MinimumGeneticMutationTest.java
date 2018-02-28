package BreadthFirstSearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

/**
 * Test for [LeetCode][433] Minimum Genetic Mutation.
 *
 * @author jieqiong.yu
 */
public class MinimumGeneticMutationTest {

    @Mock
    private MinimumGeneticMutation solution;

    public MinimumGeneticMutationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new MinimumGeneticMutation();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        assertEquals(1, solution.minMutation(start, end, bank));
    }

    /**
     * Example 2.
     */
    @Test
    public void testcase2() {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        assertEquals(2, solution.minMutation(start, end, bank));
    }
    
    /**
     * Example 3.
     */
    @Test
    public void testcase3() {
        String start = "AAAAACCC";
        String end = "AACCCCCC";
        String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
        assertEquals(3, solution.minMutation(start, end, bank));
    }
    
    /**
     * Scenario: end does not exist in bank.
     */
    @Test
    public void testcase4() {
        String start = "AACCTTGG";
        String end = "AATTCCGG";
        String[] bank = {"AATTCCGG","AACCTGGG","AACCCCGG","AACCTACC"};
        assertEquals(-1, solution.minMutation(start, end, bank));
    }
}
