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

- 每次入栈一层，出栈所有的记录到list，然后把其下一层的都放入栈中，进入下一层
- 逐层迭代进行

```
  +++++++++++      +++++++++++
->        3 +      +
  +++++++++++      +++++++++++

  +++++++++++      +++++++++++
->    20  9 +      + 3          -> 3
  +++++++++++      +++++++++++

  +++++++++++      +++++++++++
->    15  7 +      + 20 9       -> 9 20
  +++++++++++      +++++++++++

  +++++++++++      +++++++++++
->          +      + 7 15       -> 15 7
  +++++++++++      +++++++++++
```
