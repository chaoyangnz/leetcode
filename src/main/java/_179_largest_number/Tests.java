
package _179_largest_number;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,203, 30, 45, 323, 30, 6, 3, 22, 45, 2,289,390, 3003};
		String num = solution.largestNumber(nums);
		System.out.println(num);
	}
	
}
