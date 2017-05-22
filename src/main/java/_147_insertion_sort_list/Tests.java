
package _147_insertion_sort_list;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode head = ListUtil.buildLinkedList(1,3,2,5,6,7,4);

        ListNode head1 = solution.insertionSortList(head);
	}
	
}
