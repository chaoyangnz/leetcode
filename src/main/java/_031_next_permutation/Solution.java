
package _031_next_permutation;

/**
 * https://leetcode.com/problems/next-permutation
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;

        int i = nums.length-2;
        int max = nums[nums.length-1];
        while (i >= 0) {
            if(nums[i] >= max) {
                max = nums[i];
                --i;
            } else {
                // need to find the close bigger one to swap from the rightmost
                // rightmost already descent
                for(int x = nums.length-1; x >= i+1; --x) {
                    if(nums[x] > nums[i]) {
                        // swap
                        swap(nums, i, x);
                        break;
                    }
                }
                break;
            }
        }

        // reverse rightmost
        int left = i+1, right = nums.length-1;
        while (left < right) {
            swap(nums, left, right);
            ++left; --right;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

