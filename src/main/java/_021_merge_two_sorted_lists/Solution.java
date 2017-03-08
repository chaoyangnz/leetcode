
package _021_merge_two_sorted_lists;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode node1 = l1, node2 = l2;
        ListNode head, tail;
        if(l1.val < l2.val) {
            head = l1; node1 = l1.next;
        } else {
            head = l2; node2 = l2.next;
        }

        tail = head;

        while (node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                tail.next = node1;
                tail = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                tail = node2;
                node2 = node2.next;
            }
        }

        if(node1 == null) tail.next = node2;
        if(node2 == null) tail.next = node1;

        return head;
    }
}
