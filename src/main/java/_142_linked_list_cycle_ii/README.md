# Problem

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?

# Solution

首先快慢指针，找到相遇点。然后想象从相遇点开始断开，将会形成两个链表。

于是，问题变为找两个链表的交叉点。具体参见 #160. Intersection of Two Linked Lists