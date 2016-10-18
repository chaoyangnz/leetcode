# Problem

Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?

# Analysis

这题求对称链表。思路是先找到中间节点，然后将后半部分反转。这样就可以和数组一样，一个从左、一个从右开始遍历一遍。

如何找中间节点？快慢指针！

- 1 -> 2 -> 3 <- 2 <- 1         => 中间节点是3
- 1 -> 2 -> 3 -> 3 <- 2 <- 1    => 中间节点是第4个的那个3

这题如果做了反转了，相当于破坏了原来的链表结构，有没有更好的方式保留原来的结构呢？