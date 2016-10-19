
package _225_implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/implement-stack-using-queues
 */
public class Solution {

}

class MyStack {
    private static class Wrapper {
        int val;
        Wrapper(int val) {this.val = val;}
    }
    private Queue<Wrapper> queue = new LinkedList<>();
    private Wrapper top;

    // Push element x onto stack.
    public void push(int x) {
        top = new Wrapper(x);
        queue.offer(top);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(top == null) return;
        Wrapper nextTop = null;
        while (true) {
            Wrapper current = queue.poll();
            if(current == top) {
                top = nextTop;
                break;
            } else {
                queue.offer(current);
                nextTop = current;
            }
        }
    }

    // Get the top element.
    public int top() {
        return top.val;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
