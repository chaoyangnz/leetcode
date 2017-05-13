
package _100_same_tree;

import _000_util.TreeNode;
import _000_util.TreeUtil;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        TreeNode p = TreeUtil.buildTree(1,2,3,4, null, 5, 6, 3);
        TreeNode q = TreeUtil.buildTree(1,2,3,4, null, 5, 6);

        System.out.println(solution.isSameTree(p, q));
    }
	
}
