
package _495_teemo_attacking;

/**
 * https://leetcode.com/problems/teemo-attacking
 */
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length == 0) return 0;

        int sum = 0;
        for(int i = 1; i < timeSeries.length; ++i) {
            int distance = timeSeries[i] - timeSeries[i-1];
            sum += Math.min(distance, duration);
        }
        sum += duration;
        return sum;
    }
}

