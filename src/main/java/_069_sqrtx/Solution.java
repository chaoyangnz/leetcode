
package _069_sqrtx;

/**
 * https://leetcode.com/problems/sqrtx
 */
public class Solution {
    public int mySqrt(int x) {
        int l = 0; int r = x;

        while(l <= r) {
            int mid = (l + r) >> 1;
            long product = 1L * mid * mid;
            if(product < 0 || product > x ) {
                r = mid - 1; continue;
            }

            if(product < x) {
                l = mid + 1; continue;
            }

            if(product == x) {
                return mid;
            }
        }

        return l-1;
    }
}
