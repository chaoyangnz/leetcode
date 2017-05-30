
# Problem

Given a string, find the length of the **longest substring** without repeating
characters.

**Examples:**

Given `"abcabcbb"`, the answer is `"abc"`, which the length is 3.

Given `"bbbbb"`, the answer is `"b"`, with the length of 1.

Given `"pwwkew"`, the answer is `"wke"`, with the length of 3. Note that the
answer must be a **substring**, `"pwke"` is a _subsequence_ and not a
substring.



[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters)

# Solution


两个游标i, j. 当j前进到存在重复时，前进i。

中间使用Set保存着不重复的字符。前进j时，加入字符；前进i时，剔除字符。


