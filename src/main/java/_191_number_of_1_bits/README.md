# Problem

Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer '11' has binary representation 00000000000000000000000000001011, so the function should return 3.

# Analysis

位操作，依次测试每位是不是1

特别注意负数。对于正数，因为前面会有很多0，所以可以及时停止测试。