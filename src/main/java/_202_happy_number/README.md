# Problem

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number
- 1<sup>2</sup> + 9<sup>2</sup> = 82
- 8<sup>2</sup> + 2<sup>2</sup> = 68
- 6<sup>2</sup> + 8<sup>2</sup> = 100
- 1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1

# Analysis

这题做法很直接，但是题目说loop endlessly，这个是要解决的。怎么才能保证不endless呢？

经过观察，发现当某个数不happy的时，必然会出现位数组合重复，如：17

- 1<sup>2</sup> + 7<sup>2</sup> = 50
- 5<sup>2</sup> + 0<sup>2</sup> = 25
- 2<sup>2</sup> + 5<sup>2</sup> = 29
- 2<sup>2</sup> + 9<sup>2</sup> = 85  <----
- 8<sup>2</sup> + 5<sup>2</sup> = 89
- 8<sup>2</sup> + 9<sup>2</sup> = 145
- 1<sup>2</sup> + 4<sup>2</sup> + 5<sup>2</sup> = 42
- 4<sup>2</sup> + 2<sup>2</sup> = 20
- 2<sup>2</sup> + 0<sup>2</sup> = 4
- 4<sup>2</sup> = 16
- 1<sup>2</sup> + 6<sup>2</sup> = 37
- 3<sup>2</sup> + 7<sup>2</sup> = 58  <----

到此，发现了吗？`58`和先前的`85`就属于重复了。

我们可以估计，所有整数（最大为2147483647，10位数字）的位数平方和不会超过810。（9<sup>2</sup> x 10）

于是，这些平方和不会超过3个数字。为了记下这些组合，我们把每次得到的位数（排除0）按从小到大排列并变成一个整数，作为下标记录其是否存在过。
如508 => 58,  850 => 58，所以我们判断508和850属于重复。

