
package _371_sum_of_two_integers;

import _000_util.BinaryUtil;

/**
 * https://leetcode.com/problems/sum-of-two-integers
 */
public class Solution {
    public int getSum(int a, int b) {
        int result = 0;
//        System.out.println(BinaryUtil.toBinary(a, Integer.SIZE));
//        System.out.println(BinaryUtil.toBinary(b, Integer.SIZE));

        int remaining = 0;
        for(int i = 0; i < Integer.SIZE; ++i) {
            int bita = bit(a, i), bitb = bit(b, i);
            int bit = bita ^ bitb ^ remaining;
            if(bit == 1) result |= (1 << i);
            remaining = (bita == 1 && bitb == 1) || ((bita ^ bitb) == 1 && remaining == 1) ? 1 : 0;
            System.out.println(BinaryUtil.toBinary(result, Integer.SIZE));
        }

        return result;
    }

    // 0 or 1
    public int bit(int x, int i) {
        return (x >> i) & 1;
    }
}
