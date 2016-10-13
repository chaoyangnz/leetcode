
package _189_rotate_array;

import org.junit.Test;

import java.util.Arrays;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3};
		solution.rotate(nums, 4);
		System.out.println(Arrays.toString(nums));
	}
	
}
