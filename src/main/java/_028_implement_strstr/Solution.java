
package _028_implement_strstr;

/**
 * https://leetcode.com/problems/implement-strstr
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null) return -1;
        if(haystack.equals(needle)) return 0;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        final int M = haystack.length(), N = needleArr.length;
        if(M < N) return -1;

        for(int i = 0; i < M; ++i) {
            if(i + N > M) return -1;

            boolean found = true;
            for(int j = 0; j < N; ++j) {
                if(haystackArr[j+i] != needleArr[j]) {
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }

        return -1;
    }

    public int strStrOpt(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
