
package _009_palindrome_number;

/**
 * https://leetcode.com/problems/palindrome-number
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x%10 == 0) return false;
        if(x < 10) return true;

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse*10 + x%10;
            x /= 10;
        }

        return x == reverse || x == reverse/10;
    }
}
