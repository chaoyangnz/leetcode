
package _143_reorder_list;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode head = ListUtil.buildLinkedList(1,2,3,4,5);
        solution.reorderList(head);
	}
	
}
