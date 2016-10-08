
package _231_power_of_two;

/**
 * https://leetcode.com/problems/power-of-two
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return Integer.bitCount(n) == 1;
    }
}