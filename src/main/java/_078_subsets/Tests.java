
package _078_subsets;

import org.junit.Test;

import java.util.List;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
        List<List<Integer>> subsets = solution.subsets(new int[]{1,2,3});
        System.out.println(subsets);
    }
	
}
