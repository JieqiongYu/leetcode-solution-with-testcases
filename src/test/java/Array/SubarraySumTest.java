package Array;

        import org.junit.After;
        import org.junit.AfterClass;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.BeforeClass;
        import org.junit.Test;
        import org.mockito.Matchers;
        import org.mockito.Mock;

        import java.util.ArrayList;
        import java.util.List;

/**
 * Test for [LintCode][138] Rotate Array.
 *
 * @author jieqiong.yu
 */
public class SubarraySumTest {

    @Mock
    private SubarraySum solution;

    public SubarraySumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new SubarraySum();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testcase1() {
        int[] nums = {-3, 1, 2, -3, 4};

        List<Integer> expected1 = new ArrayList<>();
        expected1.add(0);
        expected1.add(2);
        String expected1String1 = expected1.toString();

        List<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(3);

        String expected1String2 = expected2.toString();

        String result = solution.subarraySum(nums).toString();
        System.out.println(result);

        Assert.assertTrue(result.equals(expected1String1) || solution.subarraySum(nums).toString().equals(expected1String2));

    }
}
