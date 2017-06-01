
package _442_find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums == null) return null;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == -1) {
                ++i; continue;
            }
            int j = nums[i]-1;
            if(i==j) {
                ++i; continue;
            }
            if(nums[i] == nums[j]) {
                list.add(nums[i]);
                nums[i] = -1; // label as empty
                ++i; continue;
            }
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
        return list;
    }
}

