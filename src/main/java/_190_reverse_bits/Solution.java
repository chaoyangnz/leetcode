
package _190_reverse_bits;

/**
 * https://leetcode.com/problems/reverse-bits
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        final int size = Integer.SIZE;
        for(int i = 0, j = size-1; i < j; ++i, --j) {
            int r = (n >> i) & 1;
            int l = (n >> j) & 1;
            if(r == l) continue;
            n ^= 1 << i; //toggle
            n ^= 1 << j; //toggle
        }

        return n;
    }
}
