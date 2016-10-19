
package _217_contains_duplicate;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,3, 4,5};
		Assert.assertFalse(solution.containsDuplicate(nums));
	}

	@Test
	public void test2() {
		int[] nums = {-1,3, 4,-1};
		Assert.assertTrue(solution.containsDuplicate(nums));
	}

	@Test
	public void test3() {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(-(Integer.MIN_VALUE+1));
	}
	
}
