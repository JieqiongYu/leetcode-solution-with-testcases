package Design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int size;
    int capacity;
    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> map;

    public LRUCache(int capacity) {
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        ListNode n = map.get(key);
        if (n != null) {
            moveToHead(n);
            return n.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        ListNode node = map.get(key);
        if (node == null) {
            node = new ListNode(value, key);
            attachToHead(node);
            size++;
        } else {
            node.val = value;
            moveToHead(node);
        }

        if (size > capacity) {
            removeLast();
            size--;
        }
        map.put(key, node);
    }

    private void moveToHead(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        attachToHead(node);
    }

    private void attachToHead(ListNode node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void removeLast() {
        ListNode last = tail.prev;
        last.prev.next = tail;
        tail.prev = last.prev;
        map.remove(last.key);
    }

    public static class ListNode {
        ListNode prev;
        ListNode next;
        int val;
        int key;

        public ListNode(int v, int k) {
            this.val = v;
            this.key = k;
            this.prev = null;
            this.next = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

