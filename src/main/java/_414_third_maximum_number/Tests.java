
package _414_third_maximum_number;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3, 2, 1}; // 3, 2, 1
		Assert.assertEquals(1, solution.thirdMax(nums));
	}

	@Test
	public void test2() { // 2, 1, x
		int[] nums = {1, 2};
		Assert.assertEquals(2, solution.thirdMax(nums));
	}

	@Test
	public void test3() { // 2, 1, x
		int[] nums = {2, 2, 3, 1};
		Assert.assertEquals(1, solution.thirdMax(nums));
	}

	@Test
	public void test4() { // 3, 2, 1, MIN
		int[] nums = {2, 3, 1, Integer.MIN_VALUE};
		Assert.assertEquals(1, solution.thirdMax(nums));
	}

	@Test
	public void test5() { // MAX, 3, 2
		int[] nums = {2, 3, 1, Integer.MAX_VALUE};
		Assert.assertEquals(2, solution.thirdMax(nums));
	}
	
}
