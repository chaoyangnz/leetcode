
package _217_contains_duplicate;

import java.util.BitSet;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        BitSet pbs = new BitSet();
        BitSet nbs = new BitSet();
        boolean minIntegerExisted = false;
        for(int num : nums) {
            if(num == Integer.MIN_VALUE) {
                if(minIntegerExisted) return true;
                minIntegerExisted = true;
            } else if(num >= 0) {
                if(pbs.get(num)) return true;
                pbs.set(num);
            } else {
                if(nbs.get(-num)) return true;
                nbs.set(-num);
            }
        }

        return false;
    }
}
