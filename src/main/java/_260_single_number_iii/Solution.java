
package _260_single_number_iii;

/**
 * https://leetcode.com/problems/single-number-iii
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0; // the xor of the two numbers
        for(int num : nums) {
            xor ^= num;
        }
        int i = Integer.numberOfTrailingZeros(xor); // the first difference bit which must be 1
        int xor1 = 0, xor2 = 0; // xor of group 1 and group 2 partitioned by ith 1 bit
        for(int num : nums) {
            if((num & (1 << i)) == 0) {
                xor1 ^= num;
            } else {
                xor2 ^= num;
            }
        }

        return new int[] {xor1, xor2};
    }
}
