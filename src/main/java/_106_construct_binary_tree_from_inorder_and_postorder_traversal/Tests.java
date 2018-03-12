
package _106_construct_binary_tree_from_inorder_and_postorder_traversal;
import org.junit.*;

public class Tests {
	private Solution solution = new Solution();

	@Test public void test1() {
        solution.buildTree(
                new int[] {9,3,15,20,7},
                new int[] {9,15,7,20,3}
        );
	}

    @Test public void test2() {

	}
}

