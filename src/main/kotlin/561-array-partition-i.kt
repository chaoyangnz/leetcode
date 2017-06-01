
@file:JvmName("ArrayPartitionIKt")

import org.junit.Test
import java.util.*



/**
 * Solution
 * ---
 * Given an array of **2n** integers, your task is to group these integers into
 * **n** pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum
 * of min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * **Example 1:**  
 * 
 *     ```
 *     **Input:** [1,4,3,2]
 *     **Output:** 4
 *     **Explanation:** n is 2, and the maximum sum of pairs is 4.
 *     ```
 * 
 * **Note:**  
 * 
 *   1. **n** is a positive integer, which is in the range of [1, 10000].
 *   2. All the integers in the array will be in the range of [-10000, 10000].
 * 
 * 
 */
fun arrayPairSum(nums: IntArray): Int {
    Arrays.sort(nums)
    var sum = 0
    var i = 0
    while (i < nums.size) {
        sum += nums[i]
        i += 2
    }
    return sum
}

/**
 * Tests
 */
class ArrayPartitionITest {
    @Test fun test1() {

    }

    @Test fun test2() {

    }
}

