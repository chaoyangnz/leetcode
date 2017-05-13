# Problem

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given `1->2->3->4->5->NULL` and k = 2,
return `4->5->1->2->3->NULL`.

# Solution

关键是从右边起算，需要直到链表长度

注意，有很多boundary cases