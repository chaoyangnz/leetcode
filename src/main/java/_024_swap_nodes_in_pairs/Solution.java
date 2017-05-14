
package _024_swap_nodes_in_pairs;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode node = dummyHead;
        while(node.next != null && node.next.next != null) {
            ListNode next = node.next;
            ListNode next2 = next.next.next;
            node.next = next.next;
            next.next.next = next;
            next.next = next2;

            node = next;
        }

        return dummyHead.next;
    }
}
