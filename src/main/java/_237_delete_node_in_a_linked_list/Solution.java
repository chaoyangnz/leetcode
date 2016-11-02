
package _237_delete_node_in_a_linked_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode current = node;
        while (current != null && current.next != null) {
            current.val = current.next.val;
            if(current.next.next == null) current.next = null;

            current = current.next;
        }
    }
}
