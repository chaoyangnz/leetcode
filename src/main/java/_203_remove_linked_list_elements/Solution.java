
package _203_remove_linked_list_elements;

/**
 * https://leetcode.com/problems/remove-linked-list-elements
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            if(current.val == val) {
                if(prev == null) { // head node to be removed
                    head = next;
                } else {
                    prev.next = next;
                }
                current.next = null;
            } else {
                prev = current;
            }

            current = next;
        }
        return head;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
