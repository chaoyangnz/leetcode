
package _169_majority_element;

/**
 * https://leetcode.com/problems/majority-element
 */
public class Solution {
    public int majorityElement(int[] nums) {
        assert nums != null && nums.length > 0;

        Integer top = null;
        int size = 0;
        for(int i=0; i< nums.length; ++i) {
            if(size == 0) {
                top = nums[i];
                size = 1;
                continue;
            }
            if(top != nums[i]) {
                size--;
            } else {
                size++;
            }
        }

        assert size != 0;
        return top;
    }
}
