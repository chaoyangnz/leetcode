# Problem
Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:
```
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```

# Solution

很容易想到尾递归，每加一个元素时，可以得到前面的子集，然后这些子集每个加这个元素
[1,2]时：
```
[
   [],
   [1],
   [2],
   [1,2]
]
```
当增加一个3时，需要增加如下子集
```
[
  [3],
  [1,3],
  [2,3],
  [1,2,3]
]
```

但是递归容易出现栈溢出，当nums比较大时。所以直接迭代，从前往后递推。
