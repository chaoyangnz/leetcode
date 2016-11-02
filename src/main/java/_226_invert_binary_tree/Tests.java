
package _226_invert_binary_tree;

import _000_util.TreeNode;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

//     		   4
//			 /   \
//			 2     7
//			 / \   / \
//			 1   3 6   9
	@Test
	public void test1() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node9 = new TreeNode(9);

		node2.left = node1;
		node2.right = node3;
		node7.left = node6;
		node7.right = node9;
		node4.left = node2;
		node4.right = node7;

		TreeNode node = solution.invertTree(node4);
	}
	
}
