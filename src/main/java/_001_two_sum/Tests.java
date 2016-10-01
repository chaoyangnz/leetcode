
package _001_two_sum;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {2, 7, 11, 15};

		int[] expected = {0, 1};
		Assert.assertArrayEquals(expected, solution.twoSum(nums, 9));
	}

	@Test
	public void test2() {
		int[] nums = {3,2,4};

		int[] expected = {1, 2};
		Assert.assertArrayEquals(expected, solution.twoSum(nums, 6));
	}
	
}
