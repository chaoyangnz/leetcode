
package _007_reverse_integer;

/**
 * https://leetcode.com/problems/reverse-integer
 */
public class Solution {
    public int reverse(int x) {
        int x1 = x;
        long y1 = 0L;
        while (x1 != 0) {
            y1 = y1*10 + x1 % 10L;
            x1 /= 10;
        }

        return (y1 > Integer.MAX_VALUE | y1 < Integer.MIN_VALUE) ? 0 : (int)y1;
    }
}
