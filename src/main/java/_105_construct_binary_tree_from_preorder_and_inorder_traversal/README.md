
# Problem

Given preorder and inorder traversal of a tree, construct the binary tree.

**Note:**  
You may assume that duplicates do not exist in the tree.



[Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal)

# Solution

递归。每次分拆左右树，分别构造，记录子树的preorder, inorder的起始index，及长度。

![](https://www.dropbox.com/s/37n2ba4ypp67yul/Screenshot%202018-02-18%2010.45.14.png?raw=1)