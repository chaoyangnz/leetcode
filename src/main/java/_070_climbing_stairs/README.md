# Problem

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

# Analysis

很明显可以总结出这个递推：W(n) = W(n-1) + W(n-2)

为了很大数的重复计算，可以使用记忆化搜索进行优化。将已经计算出的值存表，供后面直接使用。
