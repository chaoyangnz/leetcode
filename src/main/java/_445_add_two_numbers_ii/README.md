# Problem

You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
```
Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
```

# Solution

这题，如果按顺序求和太不方便。因为加法是从右往左算

我刚开始想到找到两个链表共同的起点，但是后面进位还是太麻烦。

用两个stack可以方便解决倒序的问题。
