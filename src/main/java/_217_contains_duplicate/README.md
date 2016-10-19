# Problem

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

# Analysis

最容易想到的使用bitset判断存在性。但是int类型有正有负，作为bitset的index必须为正数。

这里使用两个bitset，一个记录正数的存在性，一个记录负数的存在性。

对于Integer.MIN_VALUE，其绝对值已经不是int可以表示的范围，特别注意处理。

int范围：-2147483648 ～ 2147483647