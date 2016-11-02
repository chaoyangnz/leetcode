# Problem

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
```
  3
 / \
9  20
  /  \
 15   7
```
return its level order traversal as:
```
[
[3],
[9,20],
[15,7]
]
```

# Analysis

## 方式一

这里使用两个队列:
- 当前level节点 levelNodes
- 下一个level的节点 nextLevelNodes

当levelNodes全部输出后，将nextLevelNodes转移到levelNodes, 继续相同操作


```
  +++++++++++      +++++++++++
<-| 3            ->     20 9 |  
  +++++++++++      +++++++++++

  +++++++++++      +++++++++++
<-| 9 20         ->    15  7 |
  +++++++++++      +++++++++++

  +++++++++++      +++++++++++
<-| 7 15                     |
  +++++++++++      +++++++++++
```

# 方式二

使用一个队列，但是记录当前level

每当跳到下一个level时，打印