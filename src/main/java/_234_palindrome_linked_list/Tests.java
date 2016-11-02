
package _234_palindrome_linked_list;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() { // odd

		boolean result = solution.isPalindrome(ListUtil.buildLinkedList(new int[] {1,2,3,2,1}));
		Assert.assertTrue(result);
	}

	@Test
	public void test2() { // even

		boolean result = solution.isPalindrome(ListUtil.buildLinkedList(new int[] {1,2,3,3,2,1}));
		Assert.assertTrue(result);
	}

	@Test
	public void test3() {
		ListNode node1 = new ListNode(1);

		boolean result = solution.isPalindrome(node1);
		Assert.assertTrue(result);
	}
	
}
