
package _485_max_consecutive_ones;

/**
 * https://leetcode.com/problems/max-consecutive-ones
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null) return 0;

        int i = 0, j = 1, max = 0;
        while(i < nums.length) {
            if(nums[i] == 0) {
                ++i; continue;
            }
            for(;j < nums.length;++j) {
                if(nums[j] == 0) {
                    break;
                }
            }
            max = Math.max(max, j - i);
            i = j+1;
            j = i+1;
        }
        return max;
    }
}

