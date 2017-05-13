# Problem

Given a linked list, remove the nth node from the end of list and return its head.

For example,

Given linked list: `1->2->3->4->5`, and n = 2.

After removing the second node from the end, the linked list becomes `1->2->3->5`.
Note:
- Given n will always be valid.
- Try to do this in one pass.

# Solution

快慢指针，两指针总是维持n的距离。快指针先走n，然后一起前进。