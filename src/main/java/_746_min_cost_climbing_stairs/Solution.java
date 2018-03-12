package _746_min_cost_climbing_stairs;

import java.util.Arrays;

class Solution {
    int[] lookup;
    public int minCostClimbingStairs(int[] cost) {
        lookup = new int[cost.length];
        Arrays.fill(lookup, -1);
        return dp(0, cost);
    }

    private int dp(int n, int[] cost) {
        int len = cost.length;
        if(n >= len - 1) return 0;
        if(n == len - 2) return Math.min(cost[len-1], cost[len-2]);

        int c = lookup[n] != -1 ?
                lookup[n] :
                Math.min(
                        cost[n] + dp(n+1, cost),
                        cost[n+1] + dp(n+2, cost)
                );
        lookup[n] = c;
        return c;
    }
}
