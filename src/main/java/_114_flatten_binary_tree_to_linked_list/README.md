# Problem

Given a binary tree, flatten it to a linked list in-place.

For example,
Given
```
     1
    / \
   2   5
  / \   \
 3   4   6
```
The flattened tree should look like:
```
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
```

# Analysis

很显然，做一个先序遍历就可以。为了后面连接成链表，为用一个stack保存其顺序，而不是一个list。