
package _405_convert_a_number_to_hexadecimal;

/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal
 */
public class Solution {

    public String toHex(int num) {
        if(num == 0) return "0";

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder hex = new StringBuilder();
        boolean hasOne = false;
        for(int i = 7; i >= 0; --i) {
            char ch = hexChars[(num >>> 4*i) & 0xf];
            if(!hasOne && ch == '0') continue;
            hex.append(ch);
            hasOne = true;
        }
        return hex.toString();
    }

}
