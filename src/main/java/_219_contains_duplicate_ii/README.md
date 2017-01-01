# Problem

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
and the difference between i and j is at most k.

# Analysis

因为需要记住上次重复数的index，所以bitset是不能用了，那就用HashMap.