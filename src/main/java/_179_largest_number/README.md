# Problem

Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

# Analysis

这题主要是比较两个等长度字符串大小。

当我们把两个数按顺序和逆序排列时，然后以此比较字符，只要不相等，就一直比较下去。当出现大或小的时候，立即可以得到比较大小。

