# Problem

Implement pow(x, n).

# Analysis

这题我原来是直接绝对值，先算正指数，然后再1/pow，其实没必要，而且有问题

`Math.abs(Integer.MIN_VALUE)` 这个你猜结果是什么？结果还是负数，而且就是`Integer.MIN_VALUE`.

现在的做法是:
- x<sup>7</sup> = x<sup>3</sup>*x<sup>3</sup>*x
- x<sup>-7</sup> = x<sup>-3</sup>*x<sup>-3</sup>*x<sup>-1</sup>

所以先定义x的1次方和-1次方。

在最开始，对一些特殊情况，及时给出结果，减少递归。
