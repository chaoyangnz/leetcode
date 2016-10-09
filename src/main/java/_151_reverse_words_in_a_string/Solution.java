
package _151_reverse_words_in_a_string;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string
 */
public class Solution {
    public String reverseWords(String s) {
        String[] segs = s.trim().split("\\s+");
        if(segs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for(int i = segs.length-1; i > 0; i--) {
            sb.append(segs[i]).append(" ");
        }
        sb.append(segs[0]);
        return sb.toString();
    }
}
