# Problem

Given an array of integers, every element appears three times except for one, which appears exactly once.
Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

# Solutions

因为是奇数次，无法使用XOR的性质。

本题采用bit计数法：计数每个bit的总数，最后取3的模，可以得到唯一出现一次的那个。

一个思想是，将数看作是bit数组。

同理，这题可以进一步推广为appears N times except for one, which apepears M times. (M != N)