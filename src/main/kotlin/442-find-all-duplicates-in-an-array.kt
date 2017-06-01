
@file:JvmName("FindAllDuplicatesInAnArrayKt")

import org.junit.Test
import java.util.*





/**
 * Solution
 * ---
 * Given an array of integers, 1 ≤ a[i] ≤ _n_ (_n_ = size of array), some
 * elements appear **twice** and others appear **once**.
 * 
 * Find all the elements that appear **twice** in this array.
 * 
 * Could you do it without extra space and in O(_n_) runtime?
 * 
 * **Example:**  
 * 
 *     ```
 *     **Input:**
 *     [4,3,2,7,8,2,3,1]
 *     **Output:**
 *     [2,3]
 *     ```
 * 
 * 
 */
fun findDuplicates(nums: IntArray?): List<Int>? {
    if (nums == null) return null
    val list = ArrayList<Int>()
    var i = 0
    while (i < nums.size) {
        if (nums[i] == -1) {
            ++i
            continue
        }
        val j = nums[i] - 1
        if (i == j) {
            ++i
            continue
        }
        if (nums[i] == nums[j]) {
            list.add(nums[i])
            nums[i] = -1 // label as empty
            ++i
            continue
        }
        //swap
        nums[i] = nums[i] xor nums[j]
        nums[j] = nums[j] xor nums[i]
        nums[i] = nums[i] xor nums[j]
    }
    return list
}

/**
 * Tests
 */
class FindAllDuplicatesInAnArrayTest {
    @Test fun test1() {
        val nums = intArrayOf(4,3,2,7,8,2,3,1)
        findDuplicates(nums)
    }

    @Test fun test2() {

    }
}

