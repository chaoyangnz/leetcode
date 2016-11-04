package _414_third_maximum_number;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
  public int thirdMax(int[] nums) {
    assert nums != null && nums.length > 0;
    return kthMax(nums, 3);
  }

  private int kthMax(int[] nums, int k) {
    PriorityQueue<Long> minHeap = new PriorityQueue<>(k);
    final long FILLER = Integer.MIN_VALUE - 1L;

    for(int i = 0; i < k; ++i) {
      minHeap.offer(FILLER);
    }

    Set<Integer> set = new HashSet<>();
    for(int num : nums) {
      Long min = minHeap.peek();
      if(num > min && !set.contains(num)) {
        minHeap.remove(); set.remove(min);
        minHeap.add((long)num); set.add(num);
      }
    }
    Long min = minHeap.peek();//never null
    if(min != FILLER) return min.intValue();

    // < k numbers, return the maximum
    Integer result = null;
    while (!minHeap.isEmpty()) {
      result = minHeap.poll().intValue();////never null
    }
    return result;
  }
}
