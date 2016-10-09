
package _215_kth_largest_element_in_an_array;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        assert k >0 && k <= nums.length;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int num : nums) {
            if(pq.size() < k) {
                pq.offer(num);
            } else if(num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return pq.poll();
    }
}
