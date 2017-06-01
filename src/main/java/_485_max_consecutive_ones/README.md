
# Problem

Given a binary array, find the maximum number of consecutive 1s in this array.

**Example 1:**  

    ```
    **Input:** [1,1,0,1,1,1]
    **Output:** 3
    **Explanation:** The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.
    ```

**Note:**

  * The input array will only contain `0` and `1`.
  * The length of input array is a positive integer and will not exceed 10,000



[Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones)

# Solution

注意，当找到一段连续1的时候。步进应该从这个0之后再开始

