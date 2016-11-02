
package _141_linked_list_cycle;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        do {
            if(slow == null || fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        return true;
    }
}
