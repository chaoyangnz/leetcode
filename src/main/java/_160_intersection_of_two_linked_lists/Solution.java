
package _160_intersection_of_two_linked_lists;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode node1 = headA;
        ListNode node2 = headB;
        int len1 = 0, len2 = 0;
        while (node1 != null) {
            node1 = node1.next;
            len1++;
        }
        while (node2 != null) {
            node2 = node2.next;
            len2++;
        }

        if(len1 > len2) {
            node1 = headA;
            node2 = headB;
        } else {
            node1 = headB;
            node2 = headA;
        }

        int diff = Math.abs(len1-len2);

        int i = 0;
        while (node1 != null && node2 != null) {
            if(i < diff) {
                node1 = node1.next;
                ++i;
            } else {
                if(node1 == node2) return node1;
                node1 = node1.next;
                node2 = node2.next;
            }
        }

        return null;
    }

    public ListNode getIntersectionNodeOpt(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode node1 = headA;
        ListNode node2 = headB;

        while (node1 != node2) {
            node1 = (node1 == null) ? headB : node1.next;
            node2 = (node2 == null) ? headA : node2.next;
        }

        return node1;
    }
}
