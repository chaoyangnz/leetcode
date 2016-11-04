
package _027_remove_element;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {3,2,2,3};
		Assert.assertEquals(2, solution.removeElement(nums,2));
		System.out.println(Arrays.toString(nums));
	}

	@Test
	public void test2() {
		int[] nums = {3,2,2,3,5,8,2,2};
		Assert.assertEquals(4, solution.removeElement(nums,2));
		System.out.println(Arrays.toString(nums));
	}

	@Test
	public void test3() {
		int[] nums = {3,2,2,3,5,8,2,2,3};
		Assert.assertEquals(5, solution.removeElement(nums,2));
		System.out.println(Arrays.toString(nums));
	}
}
