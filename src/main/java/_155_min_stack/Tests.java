
package _155_min_stack;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();   //--> Returns -3.
		minStack.pop();
		minStack.top();      //--> Returns 0.
		minStack.getMin();   //--> Returns -2.
	}
	
}
