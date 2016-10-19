# Problem

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

# Analysis

No two characters may map to the same character but a character may map to itself.

这句限制非常重要。

我这里使用一个hash map保存映射(s -> t)，用另一个set保存已经映射到的目标字符。

每次迭代，检查映射：
- 如果映射不存在，我们可能需要加入映射（例外是，当目标映射字符已经被映射过）
- 否则，检查字符对是否满足已存在映射
```
ab
aa
```

- index为1时，a映射到其自身
- index为2时，b没有映射过，想映射到a，但是a已经被a映射到过。


其实，如果使用双向map就更棒了，参见BiMap.
维护两个HashMap也能实现类似的功能。