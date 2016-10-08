
package _125_valid_palindrome;

/**
 * https://leetcode.com/problems/valid-palindrome
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return true;

        char[] chars = s.toLowerCase().toCharArray();
        int i=0, j=chars.length-1;

        while (i < j) {
            if(!isAlphanumeric(chars[i])) {
                i++; continue;
            }
            if(!isAlphanumeric(chars[j])) {
                j--; continue;
            }
            if(chars[i++] != chars[j--]) return false;
        }

        return true;
    }

    private boolean isAlphanumeric(char ch) {
        return (ch >= 'a' && ch <='z') || (ch >= '0' && ch <= '9');
    }
}
