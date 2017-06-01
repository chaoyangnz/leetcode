
@file:JvmName("ProductOfArrayExceptSelfKt")

import org.junit.Test

/**
 * Solution
 * ---
 * Given an array of _n_ integers where _n_ > 1, `nums`, return an array `output`
 * such that `output[i]` is equal to the product of all the elements of `nums`
 * except `nums[i]`.
 * 
 * Solve it **without division** and in O(_n_).
 * 
 * For example, given `[1,2,3,4]`, return `[24,12,8,6]`.
 * 
 * **Follow up:**  
 * Could you solve it with constant space complexity? (Note: The output array
 * **does not** count as extra space for the purpose of space complexity
 * analysis.)
 * 
 * 
 */
fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size)
    output[0] = 1

    var prefixProduct = 1
    for (i in 1..nums.size - 1) { // compute previous product
        prefixProduct *= nums[i - 1]
        output[i] = prefixProduct
    }
    var suffixProduct = 1
    for (i in nums.size - 2 downTo 0) {
        suffixProduct *= nums[i + 1]
        output[i] *= suffixProduct
    }
    return output
}

/**
 * Tests
 */
class ProductOfArrayExceptSelfTest {
    @Test fun test1() {
        val nums = intArrayOf(1,2,3,4)
        productExceptSelf(nums).print()
    }

    @Test fun test2() {

    }
}

