
package _204_count_primes;

import java.util.BitSet;

/**
 * https://leetcode.com/problems/count-primes
 */
public class Solution {
    public int countPrimes(int n) {
        if(n < 2) return 0;

        BitSet composites = new BitSet(n); // initial all are primes
        int count = 0; // the first prime is 2
        for(int num = 2; num>= 0 && num < n; ++num) {
            if(!composites.get(num)) { // is prime
                count++;
                for(int i=2; num*i >= 0 && num*i < n; i++) {
                    composites.set(num*i);
                }
            }
        }
        return count;
    }
}
