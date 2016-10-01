# Problem

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

# Analysis

因为String是immutable, 最后总得需要创建新数组，有两种方式：

- 前后swap
- 从后往前按序拷贝