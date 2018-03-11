# Question

Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

Example 1:

Input:
```text
    3
   / \
  9  20
    /  \
   15   7
```
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].

Note:

The range of node's value is in the range of 32-bit signed integer.

# Solution

用一个队列，每次开始处理前，其中全部为一个level的所有节点，处理完这一层的节点后，刚好剩下为下一层的所有节点。
