# Problem

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

# Analysis

这题首先想到的是先做一个sort，然后直接取median，复杂度为O(nlogn)

再优化一下，既然两个数组都是有序的，这不就是归并排序的其中一步了吗？复杂度为O(n)

为了达到O(logn), 我们会想到二分查找。

我们需要解决的问题是找到第K大的数（median只是第K大数的一种特殊情况而已），假设第K大数字为y：
因为我们不知道两个数组放一起的有序情况，假设我们从第一个数组取x个数比y小，显然我们还需要从第二个数组取k-x个数比y小。
现在我们不确定x是多少，那么我们就试着从第一个数组取k/2, 然后显然第二个数组也是k/2.
于是，我们可以验证我们的取法是不是正确，比较各自取到的子数组的边界最大值[x], [k-x]
arr1:  ......[x]
arr2:  ......[k-x]

## 当[x] < [k-x]:
很显然，数组1中的x个数肯定是比y小了，但是数组2中的k-x个数就不一定了, 因为arr1中比x大的数有可能比[k-x]还小
既然确定了x个数，我们需在剩下的arr1[x...] 和arr2中找到k-x个数比y小

## 当[x] > [k-x]:
情况相似

## 当[x] = [k-x]:
找到了

