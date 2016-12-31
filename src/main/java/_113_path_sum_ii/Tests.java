
package _113_path_sum_ii;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode root = TreeUtil.buildTree(5,4,8,11,null,13,4,7,2,null,null,5,1);
		System.out.println(solution.pathSum(root, 22));
	}

	@Test
	public void test2() {
		TreeNode root = TreeUtil.buildTree(5,4,8,11,null,13,4,7,2,null,null,5,1);
		System.out.println(new Solution1().pathSum(root, 22));
	}
	
}
