
@file:JvmName("MaxConsecutiveOnesKt")

import org.junit.Test

/**
 * Solution
 * ---
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 
 * **Example 1:**  
 * 
 *     ```
 *     **Input:** [1,1,0,1,1,1]
 *     **Output:** 3
 *     **Explanation:** The first two digits or the last three digits are consecutive 1s.
 *         The maximum number of consecutive 1s is 3.
 *     ```
 * 
 * **Note:**
 * 
 *   * The input array will only contain `0` and `1`.
 *   * The length of input array is a positive integer and will not exceed 10,000
 * 
 * 
 */
fun findMaxConsecutiveOnes(nums: IntArray?): Int {
    if (nums == null) return 0

    var i = 0
    var j = 1
    var max = 0
    while (i < nums.size) {
        if (nums[i] == 0) {
            ++i
            continue
        }
        while (j < nums.size) {
            if (nums[j] == 0) {
                break
            }
            ++j
        }
        max = Math.max(max, j - i)
        i = j + 1
        j = i + 1
    }
    return max
}

/**
 * Tests
 */
class MaxConsecutiveOnesTest {
    @Test fun test1() {
        val nums = intArrayOf(1,1,0,1,1,1)
        println(findMaxConsecutiveOnes(nums))
    }

    @Test fun test2() {

    }
}

