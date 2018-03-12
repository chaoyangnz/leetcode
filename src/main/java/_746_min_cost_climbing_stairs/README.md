# Question

On a staircase, the `i`-th step has some non-negative cost `cost[i]` assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
```
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
```
Example 2:
```
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
```

Note:
- cost will have a length in the range [2, 1000].
- Every cost[i] will be an integer in the range [0, 999].

# Solution

典型dynamic programming

找递推式:

C<sub>N</sub> = min{ cost[N] + C<sub>N+1</sub>, cost[N+1] + C<sub>N+2</sub> }

注意边界停止条件,
- 当倒数第二个`length-2`是，最小就是最后两个cost中最小的
- 当只有最后一个`length-1` 时，最小代价为0
- 大于length, 也是0

使用Memoization进行优化重复计算: lookup表
