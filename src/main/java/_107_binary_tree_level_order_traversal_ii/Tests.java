
package _107_binary_tree_level_order_traversal_ii;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

//	   			3
//			   / \
//			   9  20
//			     /  \
//			    15   7
	@Test
	public void test1() {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		node3.left = node9;
		node3.right = node20;
		node20.left = node15;
		node20.right = node7;

		System.out.println(solution.levelOrderBottom(node3));
	}

//	   			1
//			   / \
//			  2   3
//			 /     \
//			4       5
	@Test
	public void test2() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.right = node5;

		System.out.println(solution.levelOrderBottom(node1));
	}
	
}
