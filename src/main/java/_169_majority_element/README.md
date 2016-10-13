# Problem

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

# Analysis

经典的leader问题。

当每次从数组中删除两个不同的元素时，原来的leader仍是剩下数组的leader。

证明一下：设原来leader出现k次，k > n/2
- 当删除的是leader和非leader，现在leader占k-1 > n/2-1, 即k-1 > (n-2)/2. 这里(n-2)/2也是新数组的一半
- 当删除两个非leader，现在leader占k > n/2 > (n-2)/2, 显然仍是leader

实现方式是遍历数组，每次和栈顶部比较，如果不相等，栈就减少，否则，栈增长。栈中的元素必然都相同，并且最后为leader


