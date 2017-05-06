
package _401_binary_watch;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-watch
 */
public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for(int h=0; h <12; ++h) {
            int b1 = Integer.bitCount(h);
            if(b1 > num) continue;
            for(int m=0; m < 60; ++m) {
                if(Integer.bitCount(m) == num - b1) {
                    times.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return times;
    }
}
