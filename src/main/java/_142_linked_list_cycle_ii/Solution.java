
package _142_linked_list_cycle_ii;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head.next.next, slow = head.next;

        ListNode cross = null;
        while(fast != null && slow != null) {
            if(fast == slow) {
                cross = fast;
                break;
            }
            if(fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        if(cross == null) return null; //no cycle

        ListNode head1 = head, head2 = cross.next;
        ListNode node1 = head1, node2 = head2;
        while(node1 != node2) {
            node1 = node1 == cross ? head2 : node1.next;
            node2 = node2 == cross ? head1 : node2.next;
        }

        return node1;
    }

    public ListNode detectCycleOpt(ListNode head) {
        ListNode fast = head, slow = head;

        while(slow != null && fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) { // found cross
                // imagine two linked lists splitted from the cross
                // now start finding the joint point.
                ListNode node1 = head, node2 = fast.next;
                while(node1 != node2) {
                    node1 = node1 == fast ? fast.next : node1.next;
                    node2 = node2 == fast ? head : node2.next;
                }
                return node1;
            }
        }
        return null;
    }
}
