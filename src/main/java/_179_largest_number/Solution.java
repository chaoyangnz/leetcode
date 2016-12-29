
package _179_largest_number;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/largest-number
 */
public class Solution {
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i=0; i < nums.length; ++i) {
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String i1, String i2) {
                char[] chars1 = (i1 + i2).toCharArray();
                char[] chars2 = (i2 + i1).toCharArray();
                int i = 0;
                while (i < chars1.length) {
                    if(chars1[i] > chars2[i]) return 1;
                    if(chars1[i] < chars2[i]) return -1;
                    ++i;
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = strings.length-1; i >=0; --i) {
            sb.append(strings[i]);
        }

        // if the leading char is 1, then all the chars will be 0
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }

    // 3 30 34  34 > 3 == 33 == 333 > 30
}
