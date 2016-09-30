
package _050_powx_n;

/**
 * https://leetcode.com/problems/powx-n
 */
public class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        if(x == 0) return n > 0 ? 0 : Double.POSITIVE_INFINITY;

        double xx = n > 0 ? x : 1.0/x;
        if(n == 1 || n == -1) return xx;

        double p = myPow(x, n/2);
        return n % 2 == 0 ? p*p : p*p*xx;
    }
}
