
package _053_maximum_subarray;

/**
 * https://leetcode.com/problems/maximum-subarray
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];

        int maxEndingHere = nums[0];
        int maxSum = nums[0];
        for(int i=1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSum = Math.max(maxEndingHere, maxSum);
        }
        return maxSum;
    }
}

