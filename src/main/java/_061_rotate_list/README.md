# Problem

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given `1->2->3->4->5->NULL` and k = 2,
return `4->5->1->2->3->NULL`.

# Solution

关键是从右边起算，需要知道链表长度

注意，有很多boundary cases

有没有one pass遍历的方法？
如果k总在有效范围，不需要modulo, 参见#19 快慢指针


《右起Nth节点问题》

