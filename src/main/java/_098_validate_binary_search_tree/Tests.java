
package _098_validate_binary_search_tree;

import _000_util.TreeNode;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(4);
		node1.left = node2;
		node1.right = node3;
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(4);
		node2.left = node4;
		node2.right = node5;
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(3);
		node5.left = node6;
		TreeNode node8 = new TreeNode(6);
		TreeNode node9 = new TreeNode(4);
		node4.left = node8;
		node4.right = node9;
		TreeNode node10 = new TreeNode(7);
		node3.left = node6;
		node3.right = node7;
		node5.left = node10;

		System.out.println(solution.isValidBST(node1));
	}

	@Test
	public void test2() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		node1.right = node2;
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;

		System.out.println(solution.isValidBST(node1));
	}
	
}
