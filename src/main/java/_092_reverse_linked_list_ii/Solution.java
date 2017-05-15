
package _092_reverse_linked_list_ii;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode head1;
        ListNode node = dummyHead;
        for(int i = 0; i < m-1; ++i) {
            node = node.next;
        }
        head1 = node;

        node = node.next;
        ListNode prev = null;
        for(int i = m; i <= n; i++) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;

            node = next;
        }

        head1.next.next = node;
        head1.next = prev;

        return dummyHead.next;
    }
}
