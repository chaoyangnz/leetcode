
package _328_odd_even_linked_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/odd-even-linked-list
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddHead = head, evenHead = head.next;
        ListNode oddTail = oddHead, evenTail = evenHead;

        ListNode current = head.next.next;
        int i = 3;
        while(current != null) {
            ListNode next = current.next;
            if(i % 2 == 0) {
                evenTail.next = current;
                evenTail = current;
            } else {
                oddTail.next = current;
                oddTail = current;
            }
            current = next;
            ++i;
        }
        oddTail.next = evenHead;
        evenTail.next = null;
        return head;
    }
}
