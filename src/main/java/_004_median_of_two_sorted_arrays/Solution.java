
package _004_median_of_two_sorted_arrays;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if((m+n)%2 > 0) { //odd
            return findKth(nums1, 0, m-1, nums2, 0, n-1, (m+n+1)/2);
        } else {
            return (findKth(nums1, 0, m-1, nums2, 0, n-1, (m+n+1)/2) + findKth(nums1, 0, m-1, nums2, 0, n-1, (m+n+1)/2+1))/2.0;
        }
    }

    /**
     * 从两个有序子数组中找到k个数比y小
     *
     * @param nums1
     * @param i1 arr1子数组的开始坐标
     * @param j1 arr1子数组的结束坐标
     * @param nums2
     * @param i2 arr2子数组的开始坐标
     * @param j2 arr2子数组的结束坐标
     * @param k 找到k个数比y小
     * @return
     */
    private double findKth(int[] nums1, int i1, int j1, int[] nums2, int i2, int j2, int k) {
        int m = j1-i1+1, n = j2-i2+1;
        if(m > n) return findKth(nums2, i2, j2, nums1, i1, j1, k); // make first array always have smaller size
        if(i1>j1) return nums2[i2+k-1];
        if(k == 1) return Math.min(nums1[i1], nums2[i2]);

        int pa = Math.min(k >> 1, m), pb = k - pa;
        if (nums1[i1+pa-1] < nums2[i2+pb-1])
            return findKth(nums1, i1+pa, j1, nums2, i2, j2, k - pa);
        else if (nums1[i1+pa-1] > nums2[i2+pb-1])
            return findKth(nums1, i1, j1, nums2, i2+pb, j2, k - pb);
        else
            return nums1[i1+pa-1];
    }
}
