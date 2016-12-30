
package _070_climbing_stairs;

/**
 * https://leetcode.com/problems/climbing-stairs
 */
public class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        if(n == 2) return 2;

        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        int i = 3;
        while (i <= n) {
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        }

        return arr[n];
    }
}
