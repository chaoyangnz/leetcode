
package _344_reverse_string;

/**
 * https://leetcode.com/problems/reverse-string
 */
public class Solution {
    public String reverseString(String s) {
        if(s == null) return null;
        if("".equals(s)) return "";

        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        char temp;
        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            ++i; --j;
        }
        return String.valueOf(chars);
    }
}
