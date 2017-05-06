
package _397_integer_replacement;

/**
 * https://leetcode.com/problems/integer-replacement
 */
public class Solution {
    public int integerReplacement(int n) {
        int step = 0;
        while (n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                int next1 = n+1;
                int next2 = n-1;
                if((next1/2) % 2 == 0 && n!=3) {
                    n = next1;
                } else {
                    n = next2;
                }
            }
            step++;
        }
        return step;
    }

    public int integerReplacement1(int n) {
        int[] steps = new int[n + 1];
        steps[1] = 0;

        for(int i = 2; i <= n; ++i) {
           if(i % 2 == 0) {
               steps[i] = steps[i/2] + 1;
           } else {
               steps[i] = Integer.min(steps[(i-1)/2], steps[(i+1)/2]) + 2;
           }
        }

        return steps[n];
    }
}
