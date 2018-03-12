
package _105_construct_binary_tree_from_preorder_and_inorder_traversal;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test public void test1() {
        solution.buildTree(
                new int[] {3,9,20,15,7},
                new int[] {9,3,15,20,7}
        );
	}

    @Test public void test2() {

	}
}

