
package _112_path_sum;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode root = TreeUtil.buildTree(5,4,8,11,null,13,4,7,2,null,null,null,1);
		System.out.println(solution.hasPathSum(root, 22));
	}

	@Test
	public void test2() {
		TreeNode root = TreeUtil.buildTree(-2,null,-1);
		System.out.println(solution.hasPathSum(root, -2));
	}
	
}
