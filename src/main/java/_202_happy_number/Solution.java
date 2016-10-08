
package _202_happy_number;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/happy-number
 */
public class Solution {
    public boolean isHappy(int n) {
        boolean[] existing = new boolean[810];
        int i = squareSum(n, null);
        while (i != 1) {
            if(existing[i]) return false; // duplicated
            i = squareSum(i, existing);
        }

        return true;
    }

    private int squareSum(int n, boolean[] existing) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(3);
        int sqrsum = 0;
        int i = n;
        while (i > 0) {
            int digit = i % 10;
            if (digit != 0) {
                sqrsum += digit * digit;
                queue.add(digit);
            }
            i /= 10;
        }

        if (existing!=null) {
            int key = 0;
            while (!queue.isEmpty()) {
                key = key * 10 + queue.poll();
            }
            existing[key] = true;
        }

        return sqrsum;
    }
}
