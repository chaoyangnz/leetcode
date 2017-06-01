
package _448_find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
                nums[i] = -1; // label as empty
                ++i; continue;
            }
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
        for(i=0; i < nums.length; ++i) {
            if(nums[i] == -1) {
                list.add(i+1);
            }
        }
        return list;
    }
}

