# Problem

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

# Analysis

这题没什么特别，就是二分查找的变形。

但是普通的求middle index的方法(low+high)/2会有overflow的问题，超出integer返回会变负数。

最清晰快捷的解决方式，使用zero fill right shift:

`(low+high) >>> 1`

当然有人也用这种:

`(hight-low)/2 + low`

也不会出现overflow