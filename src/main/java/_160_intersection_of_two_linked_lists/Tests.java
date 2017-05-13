
package _160_intersection_of_two_linked_lists;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        ListNode headA = ListUtil.buildLinkedList(1, 2, 3, 4, 5, 6);
        ListNode node3 = ListUtil.get(headA, 2);
        ListNode headB = new ListNode(9);
        headB.next = node3;

        ListUtil.print(headB);

        ListUtil.print(solution.getIntersectionNodeOpt(headA, headB));
    }
	
}
