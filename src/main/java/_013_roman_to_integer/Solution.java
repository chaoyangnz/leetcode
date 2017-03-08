
package _013_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer
 */
public class Solution {
    // I - 1
    // V - 5
    // X - 10
    // L - 50
    // C - 100
    // D - 500
    // M - 1000
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = map.get(chars[chars.length-1]);
        for(int i = chars.length-2; i >= 0; --i) {
            int current = map.get(chars[i]);
            int lower = map.get(chars[i+1]); // lower digital
            sum += current < lower ? -current : current;
        }

        return sum;
    }
}
