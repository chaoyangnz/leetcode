package _445_add_two_numbers_ii;

import _000_util.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();

        ListNode node1 = l1, node2 = l2;
        while (node1 != null) {
            stack1.push(node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            stack2.push(node2.val);
            node2 = node2.next;
        }

        ListNode resultHead = new ListNode(0);
        int sum = 0;
        while (!stack1.empty() || !stack2.empty()) {
            if(!stack1.empty()) sum += stack1.pop();
            if(!stack2.empty()) sum += stack2.pop();
            resultHead.val = sum % 10;

            ListNode node = new ListNode(sum/10);
            node.next = resultHead;
            resultHead = node;

            sum /= 10;
        }

        return resultHead.val == 0 ? resultHead.next : resultHead;
    }
}
