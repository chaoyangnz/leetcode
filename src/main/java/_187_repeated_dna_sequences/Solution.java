
package _187_repeated_dna_sequences;

import java.util.*;

/**
 * https://leetcode.com/problems/repeated-dna-sequences
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        char[] chars = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i + 9 < chars.length; ++i) {
            String seq = new String(Arrays.copyOfRange(chars, i, i+10));
            int count = 0;
            if(map.containsKey(seq)) {
                count = map.get(seq);
                if(count == 1) list.add(seq);
            }
            count++;
            map.put(seq, count);
        }

        return list;
    }

    int encode(char[] chars, int i) {
        int result = 1;
        for(int j = i; j < 10; ++j) {
            result  ^= chars[j];
        }
        return result;
    }
}
