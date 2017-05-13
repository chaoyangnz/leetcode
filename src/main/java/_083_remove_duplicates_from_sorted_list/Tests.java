
package _083_remove_duplicates_from_sorted_list;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode head = ListUtil.buildLinkedList(1,2,3,3, 4, 5,5,5,6);
        ListUtil.print(solution.deleteDuplicates(head));
	}
	
}
