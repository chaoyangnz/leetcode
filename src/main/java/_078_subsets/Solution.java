
package _078_subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(Arrays.<Integer>asList());
        for(int i=0; i < nums.length;++i) {
            List<List<Integer>> newLists = new ArrayList<List<Integer>>();
            for(List<Integer> list : lists) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(nums[i]);
                newLists.add(newList);
            }
            lists.addAll(newLists);
        }
        return lists;
    }

    // recursive version
    public List<List<Integer>> subsets0(int[] nums) {
        if(nums.length == 0) {
            List<List<Integer>> lists = new ArrayList<List<Integer>>();
            lists.add(Arrays.<Integer>asList());
            return lists;
        }
        return subsets0(nums, nums.length-1);
    }

    private List<List<Integer>> subsets0(int[] nums, int i) {
        List<List<Integer>> lists;
        if(i == 0) {
            lists = new ArrayList<List<Integer>>();
            lists.add(Arrays.<Integer>asList());
            lists.add(Arrays.asList(nums[i]));
        } else {
            List<List<Integer>> lists0 = subsets0(nums, i-1);
            lists = new ArrayList<List<Integer>>(lists0);
            for(List<Integer> list0 : lists0) {
                List<Integer> list = new ArrayList<Integer>(list0);
                list.add(nums[i]);
                lists.add(list);
            }
        }

        return lists;
    }
}
