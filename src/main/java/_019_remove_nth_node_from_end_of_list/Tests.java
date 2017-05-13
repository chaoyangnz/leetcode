
package _019_remove_nth_node_from_end_of_list;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode head = ListUtil.buildLinkedList(1,2,3,4,5);
        ListUtil.print(solution.removeNthFromEnd(head,2));
        head = ListUtil.buildLinkedList(1,2,3,4,5);
        ListUtil.print(solution.removeNthFromEnd(head,1));
        head = ListUtil.buildLinkedList(1,2,3,4,5);
        ListUtil.print(solution.removeNthFromEnd(head,3));
        head = ListUtil.buildLinkedList(1,2,3,4,5);
        ListUtil.print(solution.removeNthFromEnd(head,4));
        head = ListUtil.buildLinkedList(1,2,3,4,5);
        ListUtil.print(solution.removeNthFromEnd(head,5));
	}

	@Test
	public void test2() {
        ListNode head = ListUtil.buildLinkedList(1,2);
        ListUtil.print(solution.removeNthFromEndOpt(head,2));
    }
	
}
