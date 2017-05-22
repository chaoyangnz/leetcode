
package _147_insertion_sort_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/insertion-sort-list
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummyHead = new ListNode(0);

        ListNode p1 = head;

        while(p1 != null) {
            ListNode next = p1.next;
            p1.next = null;

            ListNode p2 = dummyHead.next;
            ListNode prev = dummyHead;
            while(p2 != null) {
                if(p2.val > p1.val) {
                    prev.next = p1;
                    p1.next = p2;
                    break;
                }
                prev = p2;
                p2 = p2.next;
            }
            if(p2 == null) {
                prev.next = p1;
            }

            p1 = next;
        }
        return dummyHead.next;
    }
}
