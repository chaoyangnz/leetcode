
package _268_missing_number;

/**
 * https://leetcode.com/problems/missing-number
 */
public class Solution {
    public int missingNumber(int[] nums) {
        final long n = nums.length;
        long sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return (int) (n * (n+1)/2 - sum);
    }
}
