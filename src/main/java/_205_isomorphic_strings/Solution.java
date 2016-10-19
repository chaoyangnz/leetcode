
package _205_isomorphic_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sa = s.toCharArray(), ta = t.toCharArray();
        final int n = sa.length;
        if(n == 0) return true;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i < n; ++i) {
            char sc = sa[i], tc = ta[i];
            if(!map.containsKey(sc)) {
                if(sc != tc && set.contains(tc)) return false;
                map.put(sc, tc);
                set.add(tc);
            } else {
                if(!map.get(sc).equals(tc)) return false;
            }
        }

        return true;
    }

}