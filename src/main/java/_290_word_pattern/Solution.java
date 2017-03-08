
package _290_word_pattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-pattern
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        assert pattern != null && str != null;

        String[] words = str.split("\\s");
        if(pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i < words.length; ++i) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if(!map.containsKey(ch)) {
                if(set.contains(word)) return false;
                map.put(ch, word);
                set.add(word);
            } else {
                if(!word.equals(map.get(ch))) return false;
            }
        }

        return true;
    }
}
