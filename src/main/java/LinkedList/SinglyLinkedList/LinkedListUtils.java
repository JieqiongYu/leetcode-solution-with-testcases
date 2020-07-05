package LinkedList.SinglyLinkedList;

public class LinkedListUtils {

    public static ListNode constructLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode head = new ListNode(-1);
        ListNode node = new ListNode(nums[0]);
        head.next = node;
        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }

        return head.next;
    }
}
