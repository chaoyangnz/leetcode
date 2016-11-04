
package _066_plus_one;

/**
 * https://leetcode.com/problems/plus-one
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i >=0; i--) {
            int sum = digits[i]+carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0) {
            int[] arr = new int[digits.length+1];
            arr[0] = carry;
            System.arraycopy(digits,0, arr, 1, digits.length);
            return arr;
        }
        return digits;
    }
}
