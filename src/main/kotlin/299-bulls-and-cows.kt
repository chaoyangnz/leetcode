
@file:JvmName("BullsAndCowsKt")

import org.junit.*

/**
 * Solution
 * ---
 * You are playing the following [Bulls and
 * Cows](https://en.wikipedia.org/wiki/Bulls_and_Cows) game with your friend: You
 * write down a number and ask your friend to guess what the number is. Each time
 * your friend makes a guess, you provide a hint that indicates how many digits
 * in said guess match your secret number exactly in both digit and position
 * (called "bulls") and how many digits match the secret number but locate in the
 * wrong position (called "cows"). Your friend will use successive guesses and
 * hints to eventually derive the secret number.
 * 
 * For example:
 * 
 *     ```
 *     Secret number:  "1807"
 *     Friend's guess: "7810"
 *     ```
 * 
 * `1``3``8``0``1``7`
 * 
 * Write a function to return a hint according to the secret number and friend's
 * guess, use `A` to indicate the bulls and `B` to indicate the cows. In the
 * above example, your function should return `"1A3B"`.
 * 
 * Please note that both secret number and friend's guess may contain duplicate
 * digits, for example:
 * 
 *     ```
 *     Secret number:  "1123"
 *     Friend's guess: "0111"
 *     ```
 * 
 * `1``1``"1A1B"`
 * 
 * You may assume that the secret number and your friend's guess only contain
 * digits, and their lengths are always equal.
 * 
 * **Credits:**  
 * Special thanks to [@jeantimex](https://leetcode.com/discuss/user/jeantimex)
 * for adding this problem and creating all test cases.
 * 
 * 
 */
fun bullsAndCows() {

}

/**
 * Tests
 */
class BullsAndCowsTest {
    @Test fun test1() {

    }

    @Test fun test2() {

    }
}

