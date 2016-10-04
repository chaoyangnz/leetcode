
package _004_median_of_two_sorted_arrays;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if((m+n)%2 > 0) { //odd
            return findKth(nums1, 0, nums2, 0, (m+n+1)/2);
        } else {
            return (findKth(nums1, 0, nums2, 0, (m+n+1)/2) + findKth(nums1, 0, nums2, 0, (m+n+1)/2+1))/2.0;
        }
    }

    /**
     * 从两个有序子数组中找到k个数比y小
     *
     * @param nums1
     * @param i1 arr1子数组的开始坐标
     * @param nums2
     * @param i2 arr2子数组的开始坐标
     * @param k 找到k个数比y小
     * @return
     */
    private double findKth(int[] nums1, int i1, int[] nums2, int i2, int k) {
        int m = nums1.length-i1, n = nums2.length-i2;
        if(m > n) return findKth(nums2, i2, nums1, i1, k); // make first array always have smaller size

        if(i1 == nums1.length) return nums2[i2+k-1];
        if(k == 1) return Math.min(nums1[i1], nums2[i2]);

        int p1 = Math.min(k/2, m), p2 = k - p1;
        if (nums1[i1+p1-1] < nums2[i2+p2-1])
            return findKth(nums1, i1+p1, nums2, i2, k-p1);
        else if (nums1[i1+p2-1] > nums2[i2+p2-1])
            return findKth(nums1, i1, nums2, i2+p2, k-p2);
        else
            return nums1[i1+p1-1];
    }
}
