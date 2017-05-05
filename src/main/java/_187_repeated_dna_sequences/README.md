# Problem

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG".
When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].

# Solution

既然找子串，那至少要把整个串走一遍，所以时间复杂度最少也要O(N).

使用HashMap计数即可。

为什么这题会加上bit operation的tag？暂时没想到bit operation怎么优化。

