
package _393_utf_8_validation;

/**
 * https://leetcode.com/problems/utf-8-validation
 */
public class Solution {
    public boolean validUtf8(int[] data) {
        for(int i = 0; i < data.length; ) {
            int byte1 = data[i];
            if(byte1 >>> 7 == 0) {
                ++i;
            } else if(byte1 >>> 5 == 6 &&
                    remaining(data, i+1, 1)) {
                i += 2;
            } else if(byte1 >>> 4 == 14 &&
                    remaining(data, i+1, 2)) {
                i += 3;
            } else if(byte1 >>> 3 == 30 &&
                    remaining(data, i+1, 3)) {
                i += 4;
            } else {
                return false;
            }
        }
        return true;
    }

    // 0 1 2 3 4
    private boolean remaining(int[] data, int from, int length) {
        if(from + length - 1 > data.length) return false;
        for(int i=0; i < length; ++i) {
            if(data[from+i] >>> 6 != 2) return false;
        }
        return true;
    }
}
