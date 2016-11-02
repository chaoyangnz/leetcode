# Problem

Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

# Analysis

既然不占用额外空间并且线性时间，我们想到bit操作

x y x z y U z

假设需要找到的那个数是U, 除了这个数，数组应该还有偶数个数，将他们全部异或，值肯定是0， 因为他们刚好是n对。