
package _002_add_two_numbers;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		ListNode l1 = ListUtil.buildLinkedList(new int[]{2, 4, 6});

		ListNode l2 = ListUtil.buildLinkedList(new int[]{5, 6, 4, 5});

		ListNode l3 = solution.addTwoNumbers(l1, l2);
		ListUtil.print(l3);
	}
	
}
