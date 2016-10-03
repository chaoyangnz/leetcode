
package _004_median_of_two_sorted_arrays;

import org.junit.Test;

public class Tests {
	private Solution solution = new Solution();


	@Test
	public void test1() {
		int[] nums1 = {2,5,7,9,12};
		int[] nums2 = {8,10,14,18,22,24,28};
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

	@Test
	public void test2() {
		int[] nums1 = {2,5,7,9,12};
		int[] nums2 = {3,4,6,10,11,16};
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

	@Test
	public void test3() {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		double median = solution.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}
	
}
