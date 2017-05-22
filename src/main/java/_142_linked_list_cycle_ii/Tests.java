
package _142_linked_list_cycle_ii;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode head = ListUtil.buildLinkedList(1,2,3,4,5);
        head.next.next.next.next.next = head.next.next;

        ListNode start = solution.detectCycle(head);
	}
	
}
