
@file:JvmName("TwoSumKt")

import org.junit.Assert
import org.junit.Test

/**
 * Solution
 * ---
 * Given an array of integers, return **indices** of the two numbers such that
 * they add up to a specific target.
 * 
 * You may assume that each input would have **_exactly_** one solution, and you
 * may not use the _same_ element twice.
 * 
 * **Example:**  
 * 
 *     ```
 *     Given nums = [2, 7, 11, 15], target = 9,
 *     Because nums[**0**] + nums[**1**] = 2 + 7 = 9,
 *     return [**0**, **1**].
 *     ```
 * 
 * 
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val j = map[target - nums[i]]
        if (j != null) return intArrayOf(j, i)
        map[nums[i]] = i
    }

    throw IllegalArgumentException("No solution can be found")
}

/**
 * Tests
 */
class TwoSumTest {
    @Test fun test1() {
        val nums = intArrayOf(2, 7, 11, 15)

        val expected = intArrayOf(0, 1)
        Assert.assertArrayEquals(expected, twoSum(nums, 9))
    }

    @Test fun test2() {
        val nums = intArrayOf(3, 2, 4)

        val expected = intArrayOf(1, 2)
        Assert.assertArrayEquals(expected, twoSum(nums, 6))
    }
}

