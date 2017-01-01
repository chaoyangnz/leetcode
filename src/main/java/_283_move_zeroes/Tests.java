
package _283_move_zeroes;

import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {0, 1, 0, 3, 12};
		solution.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	@Test
	public void test2() {
		int[] nums = {1,0,0};
		solution.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
