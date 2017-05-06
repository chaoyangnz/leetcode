
package _389_find_the_difference;

/**
 * https://leetcode.com/problems/find-the-difference
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        final int n = s.length();
        int ss = 0, st = 0;
        for(int i = 0; i < n; ++i) {
            ss += cs[i];
            st += ct[i];
        }
        st += ct[n];

        return (char) (st - ss);
    }

    public char findTheDifferenceOpt(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        final int n = s.length();
        int result = 0;
        for(int i = 0; i < n; ++i) {
            result ^= cs[i] ^ ct[i];
        }
        result += ct[n];

        return (char) result;
    }
}
