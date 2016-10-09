# Problem
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.

# Analysis

经典的select kth大问题。一种思路是用heap保存这k个最大的数，依次判断是不是属于k个最大的数，时间复杂度为O(nlogk)