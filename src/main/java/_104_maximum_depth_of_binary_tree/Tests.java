
package _104_maximum_depth_of_binary_tree;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        TreeNode root = TreeUtil.buildTree(3, 2, 8, 4, null, 5, 7, 9, null, 10, 5, 91, 100);
        System.out.println(solution.maxDepth(root));
    }
	
}
