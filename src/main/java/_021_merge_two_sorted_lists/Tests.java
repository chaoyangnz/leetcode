
package _021_merge_two_sorted_lists;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode l1 = ListUtil.buildLinkedList(1,2,5,8);
        ListNode l2 = ListUtil.buildLinkedList(3,4,7);
        ListUtil.print(solution.mergeTwoLists(l1, l2));
	}
	
}
