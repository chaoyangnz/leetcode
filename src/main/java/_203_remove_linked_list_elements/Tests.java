
package _203_remove_linked_list_elements;

import _000_util.ListNode;
import _000_util.ListUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

    private ListNode head;

    @Before
    public void setup() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        head = ListUtil.buildLinkedList(arr);
    }

	@Test
	public void test1() {
        ListNode h = solution.removeElements(head, 1);

        Assert.assertTrue(h.val == 2);
    }

    @Test
    public void test2() {
        ListNode h = solution.removeElements(head, 2);
    }

    @Test
    public void test3() {
        ListNode h = solution.removeElements(head, 6);
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node1.next = node2;
        ListNode h = solution.removeElements(node1, 1);
    }
	
}
