
package _189_rotate_array;

/**
 * https://leetcode.com/problems/rotate-array
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        final int n = nums.length;
        if(k > n) k %= n;
        reverse(nums, 0, n-1-k);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        if(start < 0 || start >= nums.length) return;
        if(end < 0 || end >= nums.length) return;
        for(int i=start, j=end; i < j; ++i, --j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
