
package _101_symmetric_tree;

import _000_util.TreeNode;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		//[2,3,3,4,5,5]
		TreeNode node2 = new TreeNode(2);
		TreeNode node3l = new TreeNode(3);
		TreeNode node3r = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5l = new TreeNode(5);
		TreeNode node5r = new TreeNode(5);

		node2.left = node3l;
		node2.right = node3r;
		node3l.left = node4;
		node3l.right = node5l;
		node3r.left = node5r;

		System.out.println(solution.isSymmetricIterative(node2));
	}
	
}
