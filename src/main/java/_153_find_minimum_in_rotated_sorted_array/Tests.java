
package _153_find_minimum_in_rotated_sorted_array;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(solution.findMin(nums));
	}

	@Test
	public void test2() {
		int[] nums = {1};
		System.out.println(solution.findMin(nums));
	}

	@Test
	public void test3() {
		int[] nums = {2, 3, 4, 5, 6, 7, 1};
		System.out.println(solution.findMin(nums));
	}

	@Test
	public void test4() {
		int[] nums = {};
		System.out.println(solution.findMin(nums));
	}

	@Test
	public void test5() {
		int[] nums = {2, 3, 4, 5, 6, 1};
		System.out.println(solution.findMin(nums));
	}

	@Test
	public void test6() {
		int[] nums = {4, 5, 6, 7};
		System.out.println(solution.findMin(nums));
	}

    @Test
    public void test7() {
        int[] nums = {4, 5, 6, 7, 0, 1};
        System.out.println(solution.findMin(nums));
    }

    @Test
    public void test8() {
        int[] nums = {3, 1, 2};
        System.out.println(solution.findMin(nums));
    }
}
