
# Problem

You are a professional robber planning to rob houses along a street. Each
house has a certain amount of money stashed, the only constraint stopping you
from robbing each of them is that adjacent houses have security system
connected and **it will automatically contact the police if two adjacent
houses were broken into on the same night**.

Given a list of non-negative integers representing the amount of money of each
house, determine the maximum amount of money you can rob tonight **without
alerting the police**.

**Credits:**  
Special thanks to [@ifanchu](https://oj.leetcode.com/discuss/user/ifanchu) for
adding this problem and creating all test cases. Also thanks to
[@ts](https://oj.leetcode.com/discuss/user/ts) for adding additional test
cases.



[House Robber](https://leetcode.com/problems/house-robber)

# Solution

满足dynamic programming两个属性：
- overlapping subproblems
- optimal structure

第二个属性主要用于帮助找出递推式.

这个递推式是：R<sub>N</sub> = max{ N + R<sub>N+2</sub>, R<sub>N+1</sub> }

由于overlapping subproblems的存在，说明有优化空间，典型的就是Memoization (Top down)

Memoization非常适合这个递归结构，只需要每次计算前check以下lookup表，没计算过则计算。 


