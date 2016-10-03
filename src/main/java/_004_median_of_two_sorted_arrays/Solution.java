
package _004_median_of_two_sorted_arrays;

import org.junit.Test;

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
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if(nums1.length == 0) return median(nums2, 0, nums2.length-1);
//        if(nums2.length == 0) return median(nums1, 0, nums1.length-1);
//        int i1 = 0, j1 = nums1.length-1;
//        int i2 = 0, j2 = nums2.length-1;
//
//        while (i1 < j1 && i2 < j2) {
//            double median1 = median(nums1, i1, j1);
//            double median2 = median(nums2, i2, j2);
//
//            if(median1 == median2) return median1;
//
//            int step = Math.min(half(i1, j1), half(i2, j2));
//            if(median1 < median2) {
//                i1 += step;
//                j2 -= step;
//            } else {
//                j1 -= step;
//                i2 += step;
//            }
//        }
//
//        return i1 == j1 ? remaining(nums2, i2, j2, nums1[i1]) : remaining(nums1, i1, j1, nums2[i2]);
//    }
//
//    private int half(int i, int j) {
//        boolean odd = (j+i) % 2 == 0;
//        return odd ? (j-i)/2 : (j-i)/2+1;
//    }
//
//    private double median(int[] nums, int i, int j) {
//        boolean odd = (j+i) % 2 == 0;
//        return odd ? nums[(j+i)/2] : (nums[(j+i)/2]+nums[(j+i)/2+1])/2.0;
//    }
//
//    private double remaining(int[] nums, int i, int j, int num) {
//        int len = j-i+2;
//        int[] arr = new int[len];
//        System.arraycopy(nums, i, arr, 0, len-1);
//        arr[len-1] = num;
//        for(int k=len-1; k > 0; k--) {
//            if(arr[k] < arr[k-1]) {
//                int temp = arr[k];
//                arr[k] = arr[k-1];
//                arr[k-1] = temp;
//            } else {
//                break;
//            }
//        }
//        return len%2 > 0 ? arr[(len-1)/2] : (arr[(len-1)/2]+arr[(len-1)/2+1])/2.0;
//    }

    @Test
    public void test1() {
        int[] nums1 = {2,5,7,9,12};
        int[] nums2 = {8,10,14,18,22,24,28};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    @Test
    public void test2() {
        int[] nums1 = {2,5,7,9,12};
        int[] nums2 = {3,4,6,10,11,16};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    @Test
    public void test3() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}
