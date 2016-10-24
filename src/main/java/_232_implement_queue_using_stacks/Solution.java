
package _232_implement_queue_using_stacks;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks
 */
public class Solution {

}

class MyQueue {
    private Stack<Integer> backHalf = new Stack<Integer>();
    private Stack<Integer> frontHalf = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        backHalf.push(x);
    }

    // Removes the element from in front of queue.
    // if front is empty, move back half to front, then pop
    public void pop() {
        if(!frontHalf.empty()) {
            frontHalf.pop();
            return;
        }
        while (!backHalf.empty()) {
            frontHalf.push(backHalf.pop());
        }
        frontHalf.pop();
    }

    // Get the front element.
    public int peek() {
        if(!frontHalf.empty()) {
            return frontHalf.peek();
        }
        while (!backHalf.empty()) {
            frontHalf.push(backHalf.pop());
        }
        return frontHalf.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return backHalf.empty() && frontHalf.empty();
    }
}
