
package _445_add_two_numbers_ii;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode l1 = ListUtil.buildLinkedList(3,9,9,9,9,9,9,9,9,9);
        ListNode l2 = ListUtil.buildLinkedList(7);

        ListNode head = solution.addTwoNumbers(l1, l2);
	}

	
}
