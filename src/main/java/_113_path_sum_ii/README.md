# Problem

Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
```
return
```
[
[5,4,11,2],
[5,8,4,5]
]
```

# Analysis

方法一：遍历时，记下截止该节点的累计和以及路径。

方法二：遍历时，记下截止该节点的累计和以及其父节点，这样避免了重复的路径存储和拷贝。