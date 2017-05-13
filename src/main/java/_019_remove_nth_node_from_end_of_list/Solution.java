
package _019_remove_nth_node_from_end_of_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head.next == null) return null;

        ListNode node = head;
        ListNode prevN = head;
        int distance = 0;
        while (node != null) {
            if(distance == n) {
                if(node.next == null) {//tail
                    prevN.next = prevN.next.next;
                    return head;
                } else {
                    prevN = prevN.next;
                    distance--;
                }
            }
            ++distance;
            node = node.next;
        }

        return prevN.next;
    }

    public ListNode removeNthFromEndOpt(ListNode head, int n) {
        ListNode vHead = new ListNode(0);
        vHead.next = head;
        ListNode fast = vHead, slow = vHead;

        for(int i = 0; i <= n; ++i)
            fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return vHead.next;
    }
}
