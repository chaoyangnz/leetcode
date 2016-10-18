
package _232_implement_queue_using_stacks;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.pop();
		queue.push(3);
		queue.push(4);
		queue.pop();

		System.out.println(queue);
	}

	@Test
	public void test2() {
		MyQueue queue = new MyQueue();
		queue.pop();
		queue.push(1);
		queue.push(2);
		queue.pop();
		queue.push(3);
		queue.push(4);
		queue.pop();

		System.out.println(queue);
	}
}
