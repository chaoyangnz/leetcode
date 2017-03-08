
package _367_valid_perfect_square;

/**
 * https://leetcode.com/problems/valid-perfect-square
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        assert num > 0;
        if(num == 1) return true;

        for(int i = 2; i <= num/2; ++i) {
            if(i * i == num) return true;
        }
        return false;
    }

    public boolean isPerfectSquare_logN(int num) {
        assert num > 0;
        if(num == 1) return true;
        if(num == 4) return true;

        int from = 1, to = num/2;
        while (from < to-1) {
            int mid = (from + to) / 2;
            long square = 1L * mid * mid ;
            if(num == square) return true;
            if(num < square) to = mid;
            if(num > square) from = mid;
        }

        return false;
    }
}
