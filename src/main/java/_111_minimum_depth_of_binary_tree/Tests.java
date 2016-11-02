
package _111_minimum_depth_of_binary_tree;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		TreeNode root = TreeUtil.buildTree(new Integer[] {1,2,3,4,5});
		Assert.assertEquals(2, solution.minDepth(root));
	}

	@Test
	public void test2() {
		TreeNode root = TreeUtil.buildTree(new Integer[] {1,2,3,null,4,5,6,null,null,7,8,null,null,9});
		Assert.assertEquals(3, solution.minDepth(root));
	}

	@Test
	public void test3() {
		TreeNode root = TreeUtil.buildTree(new Integer[] {1,2,3,null,4,5,6,null,null,8});
		Assert.assertEquals(3, solution.minDepth(root));
	}

	@Test
	public void test4() {
		TreeNode root = TreeUtil.buildTree(new Integer[] {1,2,3,null,4,5,null,6,null,null,7,8,null,null,null,9});
		Assert.assertEquals(4, solution.minDepth(root));
	}

	@Test
	public void test5() {
		TreeNode root = TreeUtil.buildTree(new Integer[] {30,20,40,10,25,null,50,5,15,null,28,41,null});
		Assert.assertEquals(4, solution.minDepth(root));
	}
	
}
