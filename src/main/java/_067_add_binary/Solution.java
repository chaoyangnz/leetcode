
package _067_add_binary;

/**
 * https://leetcode.com/problems/add-binary
 */
public class Solution {
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray(), bb = b.toCharArray();
        int i = aa.length-1, j = bb.length-1;
        boolean remaining = false;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            char ac = i < 0 ? '0' : aa[i];
            char bc = j < 0 ? '0' : bb[j];
            if(ac == '0' && bc == '0') {
                sb.insert(0, remaining ? '1' : '0');
                remaining = false;
            } else if(ac == '1' && bc == '1' ) {
                sb.insert(0, remaining ? '1' : '0');
                remaining = true;
            } else {
                sb.insert(0, remaining ? '0' : '1');
            }
            --i;
            --j;
        }

        if(remaining) sb.insert(0, '1');

        return sb.toString();
    }
}
