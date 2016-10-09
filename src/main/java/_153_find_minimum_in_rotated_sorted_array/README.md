# Problem

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

# Analysis

刚开始，我觉得既然局部有序，是否可以借用此二分，变成O(logN), 不过没想过怎么弄。

现在的解法就是O(n), 依次找pivot点。

