
package _137_single_number_ii;

/**
 * https://leetcode.com/problems/single-number-ii
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i < Integer.SIZE; ++i) {
            int count = 0;
            for(int num : nums) {
                if((num & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }

    int singleNumber(int[] nums, int n, int m) {
        int result = 0;
        for(int i=0; i < Integer.SIZE; ++i) {
            int count = 0;
            for(int num : nums) {
                if((num & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count % n != 0) {
                assert count % n == m % n;
                result |= (1 << i);
            }
        }
        return result;
    }
}
