
package _283_move_zeroes;

/**
 * https://leetcode.com/problems/move-zeroes
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int k = nums.length-1;

        int i = nums.length-1;
        while (i >= 0) {
            if(nums[i] == 0) {
                bubble(nums, i, k);
                k--;
            }
            i--;
        }
    }

    private static void bubble(int[] nums, int from, int to) {
        if(from == to) return;
        for(int i = from; i < to; i++) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
    }

}
