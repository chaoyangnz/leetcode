
package _114_flatten_binary_tree_to_linked_list;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);

		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node2.right = node4;
		node5.right = node6;

		solution.flatten(node1);

		Assert.assertEquals(node2, node1.right);
		Assert.assertEquals(node3, node2.right);
		Assert.assertEquals(node4, node3.right);
		Assert.assertEquals(node5, node4.right);
		Assert.assertEquals(node6, node5.right);
	}
	
}
