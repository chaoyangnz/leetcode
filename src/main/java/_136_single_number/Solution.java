
package _136_single_number;

/**
 * https://leetcode.com/problems/single-number
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }

        return result;
    }
}
