
package _003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
public class Solution {
    public int longestSubstringWithoutRepeatingCharacters(String s) {
        if(s == null) return 0;
        if(s.length() < 2) return s.length();

        int i = 0;
        int j = 1;
        char[] ca = s.toCharArray();

        Set<Character> set = new HashSet<>();
        int length = 1;
        set.add(ca[i]);
        while (j < s.length()) {
            if(!set.contains(ca[j])) {
                set.add(ca[j]);
                ++j;
            } else {
                set.remove(ca[i]);
                ++i;
            }
            length =  Integer.max(length, set.size());
        }

        return length;
    }
}

