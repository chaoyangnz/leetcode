
package _002_add_two_numbers;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;

        int carry = 0;
        ListNode head = null, tail = null;
        while (current1 != null || current2 != null) {
            int val1 = current1 != null ? current1.val : 0;
            int val2 = current2 != null ? current2.val : 0;
            int sum = val1 + val2 + carry;
            ListNode node = new ListNode(sum < 10 ? sum : sum-10);
            if(head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            carry = sum < 10 ? 0 : 1;
            if(current1 != null) current1 = current1.next;
            if(current2 != null) current2 = current2.next;
        }
        if(carry != 0) tail.next = new ListNode(carry);
        return head;
    }
}
