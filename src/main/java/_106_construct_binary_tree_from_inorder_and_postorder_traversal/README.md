
# Problem

Given inorder and postorder traversal of a tree, construct the binary tree.

**Note:**  
You may assume that duplicates do not exist in the tree.



[Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal)

# Solution

递归。

记住：
- 根节点总是在post-order的最后一个
- 根节点将in-order一分为二

![](https://i.imgur.com/t4n9Amo.jpg)

