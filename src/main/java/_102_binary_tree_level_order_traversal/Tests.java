
package _102_binary_tree_level_order_traversal;

import _000_util.TreeNode;
import _000_util.TreeUtil;
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
		Integer[] arr = {3,9,20,null,null,15,7};
		System.out.println(solution.levelOrder(TreeUtil.buildTree(arr)));
	}

//	   			1
//			   / \
//			  2   3
//			 /     \
//			4       5
	@Test
	public void test2() {
		Integer[] arr = {1,2,3,4,null,null,5};
		System.out.println(solution.levelOrder(TreeUtil.buildTree(arr)));
	}

	@Test
	public void test3() {
		Integer[] arr = {1,2,3,null,4,5,6,null,null,7,8,null,null,9};
		System.out.println(solution.levelOrder(TreeUtil.buildTree(arr)));
	}
	
}
