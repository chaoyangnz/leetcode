
package _238_product_of_array_except_self;

/**
 * https://leetcode.com/problems/product-of-array-except-self
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;

        int prefixProduct = 1;
        for(int i=1; i < nums.length; ++i) { // compute previous product
            prefixProduct *= nums[i-1];
            output[i] = prefixProduct;
        }
        int suffixProduct = 1;
        for(int i=nums.length-2; i >= 0; --i) {
            suffixProduct *= nums[i+1];
            output[i] *= suffixProduct;
        }
        return output;
    }
}

