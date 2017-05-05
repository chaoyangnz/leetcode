
package _338_counting_bits;

/**
 * https://leetcode.com/problems/counting-bits
 */
public class Solution {

    public int[] countBits(int num) {
        int[] counts = new int[num+1];
        counts[0] = 0;
        counts[1] = 1;

        int pow = 1;
        for(int i = 2; i <= num; ++i) {
            if(i == pow*2) {
                counts[i] = 1;
                pow = i;
            } else {
                counts[i] = counts[i % pow] + 1;
            }
        }

        return counts;
    }

    public int[] countBitsOpt(int num) {
        int[] counts = new int[num+1];
        //counts[0] = 0; // initial is 0

        for(int i = 1; i <= num; ++i) {
            counts[i] = counts[i>>>1] + (i & 1);
        }

        return counts;
    }
}
