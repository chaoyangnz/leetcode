
@file:JvmName("LongestSubstringWithoutRepeatingCharactersKt")

import org.junit.Test

/**
 * Solution
 * ---
 * Given a string, find the length of the **longest substring** without repeating
 * characters.
 * 
 * **Examples:**
 * 
 * Given `"abcabcbb"`, the answer is `"abc"`, which the length is 3.
 * 
 * Given `"bbbbb"`, the answer is `"b"`, with the length of 1.
 * 
 * Given `"pwwkew"`, the answer is `"wke"`, with the length of 3. Note that the
 * answer must be a **substring**, `"pwke"` is a _subsequence_ and not a
 * substring.
 * 
 * 
 */
fun lengthOfLongestSubstring(s: String?): Int {
    if(s == null) return 0
    if(s.length < 2) return s.length

    var i = 0
    var j = 1

    val set = mutableSetOf<Char>()
    var length = 1
    set.add(s[i])
    while (j < s.length) {
        if(s[j] !in set) {
            set.add(s[j])
            ++j
        } else {
//            println(s.substring(i..j-1))
            set.remove(s[i])
            ++i
        }
        length = maxOf(length, set.size)
    }

    return length
}

/**
 * Tests
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    @Test fun test1() {
        val ss = arrayOf(null, "", "x", "ayu", "abcabcbb", "bbbbb", "pwwkew")
        for (s in ss) println(lengthOfLongestSubstring(s))
    }

    @Test fun test2() {
        val s = "au"
        lengthOfLongestSubstring(s)
    }
}

