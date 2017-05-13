
package _083_remove_duplicates_from_sorted_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            ListNode next = current.next;
            if(current.val == prev.val) {
                prev.next = next;
            } else {
                prev = current;
            }
            current = next;
        }

        return head;
    }
}
