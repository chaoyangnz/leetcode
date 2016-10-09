
package _153_find_minimum_in_rotated_sorted_array;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 */
public class Solution {
    public int findMin(int[] nums) {
        final int n = nums.length;
        assert n > 0;

        if(nums[0] < nums[n-1]) return nums[0];
        for (int k=0; k < n-1; ++k) {
            if(nums[k] > nums[k+1]) return nums[k+1];
        }

        return nums[0];
    }
}
