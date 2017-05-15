# Problem

Given a singly linked list L: `L0→L1→…→Ln-1→Ln`,
reorder it to: `L0→Ln→L1→Ln-1→L2→Ln-2→…`

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

# Solution

第1遍，快慢指针找中点，一分为二。找到中点后反转后半部分。（找中点操作数n/2, 反转操作数n/2）
第2遍，前后两半同时前进，并操作指针 （连接前后两半操作数n/2)

总时间复杂度O(3n/2)