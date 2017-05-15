
package _086_partition_list;

import _000_util.ListNode;

/**
 * https://leetcode.com/problems/partition-list
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead1 = new ListNode(0);
        ListNode tail1 = dummyHead1;

        ListNode dummyHead2 = new ListNode(0);
        ListNode tail2 = dummyHead2;

        ListNode node = head;
        while(node != null) {
            if(node.val < x) {
                tail1.next = node;
                tail1 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
            node = node.next;
        }
        tail1.next = dummyHead2.next;
        tail2.next = null;

        return dummyHead1.next;
    }
}
