
package _143_reorder_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/reorder-list
 */
public class Solution {
    public void reorderList(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse half
        ListNode prev = null;
        ListNode node = slow.next;
        slow.next = null;
        while(node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;

            node = next;
        }

        ListNode node1 = head;
        ListNode node2 = prev;
        while(node1 != null && node2 != null) {
            ListNode node1next = node1.next;
            ListNode node2next = node2.next;
            node1.next = node2;
            node2.next = node1next;

            node1 = node1next;
            node2 = node2next;
        }
    }
}
