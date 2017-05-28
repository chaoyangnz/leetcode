
@file:JvmName("LongestAbsoluteFilePathKt")

import org.junit.*

/**
 * Solution
 * ---
 * Suppose we abstract our file system by a string in the following manner:
 * 
 * The string `"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"` represents:
 * 
 * The directory `dir` contains an empty sub-directory `subdir1` and a sub-
 * directory `subdir2` containing a file `file.ext`.
 * 
 * The string `"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsub
 * subdir2\n\t\t\tfile2.ext"` represents:
 * 
 * The directory `dir` contains two sub-directories `subdir1` and `subdir2`.
 * `subdir1` contains a file `file1.ext` and an empty second-level sub-directory
 * `subsubdir1`. `subdir2` contains a second-level sub-directory `subsubdir2`
 * containing a file `file2.ext`.
 * 
 * We are interested in finding the longest (number of characters) absolute path
 * to a file within our file system. For example, in the second example above,
 * the longest absolute path is `"dir/subdir2/subsubdir2/file2.ext"`, and its
 * length is `32` (not including the double quotes).
 * 
 * Given a string representing the file system in the above format, return the
 * length of the longest absolute path to file in the abstracted file system. If
 * there is no file in the system, return `0`.
 * 
 * **Note:**  
 * 
 * Time complexity required: `O(n)` where `n` is the size of the input string.
 * 
 * Notice that `a/aa/aaa/file1.txt` is not the longest file path, if there is
 * another path `aaaaaaaaaaaaaaaaaaaaa/sth.png`.
 * 
 * [Subscribe](/subscribe/) to see which companies asked this question.
 * 
 * 
 */
fun longestAbsoluteFilePath() {

}

/**
 * Tests
 */
class LongestAbsoluteFilePathTest {
    @Test fun test1() {

    }

    @Test fun test2() {

    }
}

