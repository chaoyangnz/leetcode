# Problem

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

```
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
```

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

# Analysis

对于每个生成的串，计数重复字符，知道出现新字符，输出。