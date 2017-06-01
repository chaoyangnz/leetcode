
package _565_array_nesting;

/**
 * https://leetcode.com/problems/array-nesting
 */
public class Solution {
    public int arrayNesting(int[] nums) {
        int max = 1;
        for(int i=0; i < nums.length; ++i) {
            if(nums[i] < 0) continue;
            int j = nums[i];
            int path = 1;
            while(j != i) {
                int next = nums[j];
                nums[j] = -nums[j]-1;
                path++;
                j = next;

            }
            max = Math.max(max, path);
        }
        return max;
    }
}

