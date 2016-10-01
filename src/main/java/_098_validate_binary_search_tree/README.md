# Problem

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
```
2
/ \
1   3
```
Binary tree [2,1,3], return true.

Example 2:
```
1
/ \
2   3
```
Binary tree [1,2,3], return false.

# Analysis

这题很重要的一点是将`int`提升为`long`, 因为要表示open range, `Integer.MAX_VALUE+1`和`Integer.MIN_VALUE-1`都会超出`int`的取值范围。