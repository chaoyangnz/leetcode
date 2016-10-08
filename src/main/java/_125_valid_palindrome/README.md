# Problem

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

# Analysis

这题思路很简单，两个指针，一个指向头，一个指向尾，一齐向中间移动。

注意：其中不是alphanumeric的字符要忽略掉