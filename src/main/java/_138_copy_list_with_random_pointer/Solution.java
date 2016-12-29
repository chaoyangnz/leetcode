
package _138_copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;

        Map<RandomListNode, RandomListNode> originToClone = new HashMap<>();
        Map<RandomListNode, RandomListNode> cloneToOrigin = new HashMap<>();

        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode tail = newHead;
        originToClone.put(head, newHead);
        cloneToOrigin.put(newHead, head);

        RandomListNode current = head.next;
        while (current != null) {
            RandomListNode node = new RandomListNode(current.label);
            tail.next = node;
            tail = node;
            originToClone.put(current, node);
            cloneToOrigin.put(node, current);

            current = current.next;
        }

        current = newHead;
        while (current != null) {
            current.random = originToClone.get(cloneToOrigin.get(current).random);
            current = current.next;
        }

        return newHead;
    }
}

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};