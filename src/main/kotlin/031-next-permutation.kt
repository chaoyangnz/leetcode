
@file:JvmName("NextPermutationKt")

import org.junit.Test

/**
 * Solution
 * ---
 * Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column.
 * 
 * `1,2,3` → `1,3,2`
 * 
 * `3,2,1` → `1,2,3`
 * 
 * `1,1,5` → `1,5,1`
 * 
 * 
 */
fun nextPermutation(nums: IntArray?) {
    if (nums == null || nums.size <= 1) return

    var i = nums.size - 2
    var max = nums[nums.size - 1]
    while (i >= 0) {
        if (nums[i] >= max) {
            max = nums[i]
            --i
        } else {
            // need to find the close bigger one to swap from the rightmost
            // rightmost already descent
            for (x in nums.size - 1 downTo i + 1) {
                if (nums[x] > nums[i]) {
                    // swap
                    swap(nums, i, x)
                    break
                }
            }
            break
        }
    }

    // reverse rightmost
    var left = i + 1
    var right = nums.size - 1
    while (left < right) {
        swap(nums, left, right)
        ++left
        --right
    }
}

private fun swap(nums: IntArray, i: Int, j: Int) {
    val tmp = nums[i]
    nums[i] = nums[j]
    nums[j] = tmp
}

/**
 * Tests
 */
class NextPermutationTest {
    @Test fun test1() {
        val nums = intArrayOf(3,4,5,7,6,2)

        nextPermutation(nums)

        nums.print()
    }

    @Test fun test2() {
        val nums = intArrayOf(7,6,5,4,3,2)
        nextPermutation(nums)
        nums.print()
    }

    @Test fun test3() {
        val nums = intArrayOf(1,1,5)
        nextPermutation(nums)
        nums.print()
    }
}

