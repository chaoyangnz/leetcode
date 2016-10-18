
package _232_implement_queue_using_stacks;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks
 */
public class Solution {

}

class MyQueue {
    private Stack<Integer> major = new Stack<Integer>();
    private Stack<Integer> minor = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        while (!minor.empty()) {
            major.push(minor.pop());
        }
        major.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while (!major.empty()) {
            minor.push(major.pop());
        }
        minor.pop();
    }

    // Get the front element.
    public int peek() {
        while (!major.empty()) {
            minor.push(major.pop());
        }
        return minor.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return major.empty() && minor.empty();
    }
}
