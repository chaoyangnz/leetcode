
package _219_contains_duplicate_ii;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // num -> index

        for(int j = 0; j < nums.length; ++j) {
            int num = nums[j];
            Integer i = map.get(num);
            if(i != null && j - i <= k) {
                return true;
            }
            map.put(num, j);
        }
        return false;
    }
}
