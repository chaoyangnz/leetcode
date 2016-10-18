
package _234_palindrome_linked_list;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode ptr = head, ptr2 = head;
        while (ptr2 != null && ptr2.next != null) {
            ptr = ptr.next;
            ptr2 = ptr2.next.next;
        }

        ListNode from = head;
        ListNode to = reverse(ptr);
        while (from != null && to != null) {
            if(from.val != to.val) return false;
            from = from.next;
            to = to.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode newHead = null;
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
