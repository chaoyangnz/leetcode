
package _203_remove_linked_list_elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

    private ListNode head;

    @Before
    public void setup() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        head = node1;
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
