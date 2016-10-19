
package _225_implement_stack_using_queues;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.pop();
		stack.push(2);
		stack.push(3);
		stack.push(2);
		stack.pop();
		int a = stack.top();
	}
	
}
