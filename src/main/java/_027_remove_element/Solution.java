
package _027_remove_element;

/**
 * https://leetcode.com/problems/remove-element
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;

        int i = 0, j = nums.length-1;
        while (i < j) {
            if(nums[i] == val) {
                if(nums[j] != val) {
                    swap(nums, i, j);
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return nums[i] == val ? i : i+1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
