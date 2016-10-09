
package _206_reverse_linked_list;

/**
 * https://leetcode.com/problems/reverse-linked-list
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}