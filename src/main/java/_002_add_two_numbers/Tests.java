
package _002_add_two_numbers;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(6);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		l2.next.next.next = new ListNode(5);

		ListNode l3 = solution.addTwoNumbers(l1, l2);
	}
	
}
