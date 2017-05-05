# Problem

Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's
in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

- It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
- Space complexity should be O(n).
- Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

# Solution

这一题主要是注意规律，每当到2的幂的时候，计数都会回到1，然后除掉最高位的1

例如：
0 => 0
1 => 1    reset到1
2 => 1    reset到1
3 => count(3%2)+1
4 => 1    reset到1
5 => count(5%4)+1
6 => count(6%4)+1
7 => count(7%4)+1
8 => 1    reset到1
9 => count(9%8)+1
10 => count(10/8)+1
...
16 => 1    reset到1
17 => count(17%16)+1
...

看出规律来了吗?

我们关键是判断是2的幂的时候，回到1，后面的数取模，用记忆化存储前面已经计算过了。

## 递归
另一种思路考虑递归：每次将数字右移1位，其count + 最后一位bit是否是1

递推公式是：c(n) = c(i>>>1) + (i&1)