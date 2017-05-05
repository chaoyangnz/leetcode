# Problem

Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
* The order of the result is not important. So in the above example, [5, 3] is also correct.
* Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

# Solution

因为大多数出现两次，所有异或之后得到的结果为所求结果两个数的异或
1^2^1^3^2^5=3^5

现在看这个异或结果，肯定有的位是1，否则就相同了。找出那个开始出现差异的位，将所有数按此位分成2组，
相同的数肯定在同一组，而剩下的两个数肯定在不同的组里。于是分别异或两组，就得到剩下的两个数了

3^5=6  0b110  -> i = 1时开始出现差异，按此分组

1 0b0**0**1
2 0b0**1**0
1 0b0**0**1
3 0b0**1**1
2 0b0**1**0
5 0b1**0**1

第一组(第1位为0)：`1 1 5    xor-> 5`
第二组(第1位为1)：`2 2 3    xor-> 3`


