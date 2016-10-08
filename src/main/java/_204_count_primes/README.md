# Problem

Description:

Count the number of prime numbers less than a non-negative number, n.

# Analysis

求素数，经典的排除法。参加《程序竞赛。。》

从2开始，每次取到素数，划去其倍数，如当遇到2，划去4, 6, 8, 10 ...; 当遇到3, 划去6, 9, 12, 15 ....

这样剩下的都是素数了。