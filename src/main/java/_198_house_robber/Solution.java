
package _198_house_robber;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/house-robber
 */
public class Solution {
    int[] lookup;
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;

        lookup = new int[nums.length];
        Arrays.fill(lookup, -1);
        return dp(0, nums);
    }

    private int dp(int i, int[] nums) {
        if(i >= nums.length) {
            return 0;
        }
        if(i == nums.length-1) {
            return nums[i];
        }

        int result = lookup[i] != -1 ?
                lookup[i] :
                Math.max(nums[i] + dp(i+2, nums), dp(i+1, nums));
        lookup[i] = result;
        return lookup[i];
    }
}

