package LinkedList;

import LinkedList.SinglyLinkedList.ListNode;
import org.junit.*;
import org.mockito.Mock;

import static LinkedList.SinglyLinkedList.LinkedListUtils.constructLinkedList;
import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {
    @Mock
    private AddTwoNumbers solution;

    public AddTwoNumbersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new AddTwoNumbers();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example
     */
    @Test
    public void testcase1() {
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};
        int[] numExpected = {7, 0, 8};
        ListNode input1 = constructLinkedList(nums1);
        ListNode input2 = constructLinkedList(nums2);
        ListNode expected = constructLinkedList(numExpected);
        assertEquals(expected, solution.addTwoNumbers(input1, input2));
    }
}
