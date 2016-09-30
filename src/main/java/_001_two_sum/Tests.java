
package _001_two_sum;

import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
	}

	@Test
	public void test2() {
		int[] nums = {3,2,4};
		System.out.println(Arrays.toString(solution.twoSum(nums, 6)));
	}
	
}
