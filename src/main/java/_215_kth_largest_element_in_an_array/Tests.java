
package _215_kth_largest_element_in_an_array;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3,2,1,5,6,4};
		int k = 3;
		System.out.println(solution.findKthLargest(nums, k));
	}
	
}
