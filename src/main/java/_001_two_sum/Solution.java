
package _001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for(int i=0; i < nums.length; ++i) {
            Integer j = map.get(target - nums[i]);
            if(j != null) return new int[] {j, i};
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution can be found");
    }
}
