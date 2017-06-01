
package _167_two_sum_ii_input_array_is_sorted;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length;
        while(i < j) {
            int sum = numbers[i]+numbers[j];
            if(sum == target) {
                return new int[] {i+1, j+1};
            } else if(sum < target) {
                ++i;
            } else {
                --j;
            }
        }
        throw new IllegalArgumentException("Not possible here");
    }
}

