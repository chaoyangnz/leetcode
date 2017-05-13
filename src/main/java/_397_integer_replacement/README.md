# Problem

Given a positive integer n and you can do operations as follow:

If n is even, replace n with n/2.
If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?

Example 1:
```
Input:
8

Output:
3

Explanation:
8 -> 4 -> 2 -> 1
```

Example 2:

```
Input:
7

Output:
4

Explanation:
7 -> 8 -> 4 -> 2 -> 1
or
7 -> 6 -> 3 -> 2 -> 1
```

# Solution

因为这题明显的递推关系
```
       /-- f(n/2)+1, n is even
f(n) =
       \-- MIN(f((n-1)/2), f((n+1)/2)) + 2, n is odd
```

很容易想到用记忆化搜索，但是可能exceed memory limit。用递归又容易stack overflow

想想其他方法, 因为相除一般来说比其他方式下降要快，我们总是选择相除（当数比较小的时候，额外考虑）

n为偶数时，固定的，n为奇数时，需要+1或-1到一个偶数，(n-1)和(n+1)都是偶数，
对于(n-1)/2和(n+1)/2却正好一个奇数一个偶数，我们选择偶数那个，因为它可以直接相除

唯一例外是，n=3, +-1之后分别为4和2，按理我们要选择4，因为4／2仍然为偶数，但是这里应该选择2。