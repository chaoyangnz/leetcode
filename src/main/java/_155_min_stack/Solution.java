
package _155_min_stack;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack
 */
public class Solution {

}

class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private PriorityQueue<Integer> heap = new PriorityQueue<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        heap.offer(x);
    }

    public void pop() {
        int x = stack.pop();
        heap.remove(x);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return heap.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */