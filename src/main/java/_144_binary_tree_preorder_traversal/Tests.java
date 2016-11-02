
package _144_binary_tree_preorder_traversal;

import _000_util.TreeNode;
import org.junit.Test;

import java.util.List;

public class Tests {
	private Solution solution = new Solution();

	/**
	 *     1
	 *      \
	 *       2
	 *      /
	 *    3
	 */
	@Test
	public void test1() {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		root.right = node1;
		node1.left = node2;

		List<Integer> list = solution.preorderTraversal(root);
		System.out.println(list);

//		list = solution.inorderTraversal(root);
//		System.out.println(list);
//
//		list = solution.postorderTraversal(root);
//		System.out.println(list);
	}
	
}
