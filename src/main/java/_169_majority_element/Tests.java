
package _169_majority_element;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 3, 5, 1, 1};

		System.out.println(solution.majorityElement(nums));
	}

	@Test
	public void test2() {
		int[] nums = {1};

		System.out.println(solution.majorityElement(nums));
	}

	@Test
	public void test3() {
		int[] nums = {2,2,1,1,1,2,2};

		System.out.println(solution.majorityElement(nums));
	}
	
}
