
package _061_rotate_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/rotate-list
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k < 0) return null;
        if(k == 0) return head;

        ListNode node = head;

        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }

        k %= len;
        if(k == 0) return head;

        ListNode tail = null;
        ListNode newHead = null;
        node = head;
        int i = 1;
        while (node != null) {
            ListNode next = node.next;
            if(i == len - k) {
                newHead = next;
                node.next = null;
            }
            if(next == null) {
                tail = node;
            }
            node = next;
            ++i;
        }
        tail.next = head;

        return newHead;
    }
}
