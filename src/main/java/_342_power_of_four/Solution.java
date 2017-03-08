
package _342_power_of_four;

/**
 * https://leetcode.com/problems/power-of-four
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        int t = Integer.numberOfTrailingZeros(num);

        return t % 2 == 0 && num == (1 << t);
    }
}
