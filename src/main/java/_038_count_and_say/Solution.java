
package _038_count_and_say;

/**
 * https://leetcode.com/problems/count-and-say
 */
public class Solution {
    public String countAndSay(int n) {
        String seq = "1";
        int nth = 1;
        while (nth < n) {
            char[] chars = seq.toCharArray();

            char c = '-'; // current repeat char
            int cnt = 0;   // current repeat char count
            StringBuilder sb = new StringBuilder();
            for(char ch : chars) {
                if(ch == c) {
                    cnt++;
                } else { // switch to another char
                    if(cnt != 0) sb.append(cnt).append(c);
                    c = ch;
                    cnt = 1;
                }
            }
            sb.append(cnt).append(c);

            seq = sb.toString();
            nth++;
        }

        return seq;
    }
}
