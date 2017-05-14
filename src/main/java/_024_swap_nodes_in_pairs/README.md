# Problem

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may **not** modify the values in the list, only nodes itself can be changed.

# Solution

涉及指针操作技巧

因为head节点可能会变动，为了方便代码实现，增加dummy head