
package _234_palindrome_linked_list;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() { // odd
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(1);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		boolean result = solution.isPalindrome(node1);
		Assert.assertTrue(result);
	}

	@Test
	public void test2() { // even
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(1);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		boolean result = solution.isPalindrome(node1);
		Assert.assertTrue(result);
	}

	@Test
	public void test3() {
		ListNode node1 = new ListNode(1);

		boolean result = solution.isPalindrome(node1);
		Assert.assertTrue(result);
	}
	
}
