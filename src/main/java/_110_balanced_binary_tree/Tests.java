
package _110_balanced_binary_tree;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode root = TreeUtil.buildTree(1,2,3,5,7,8,null,7);
		System.out.println(solution.isBalanced(root));
	}

	@Test
	public void test2() {
		TreeNode root = TreeUtil.buildTree(1,2,3,4,5,null,null,6,7);
		System.out.println(solution.isBalanced(root));
	}
	
}
