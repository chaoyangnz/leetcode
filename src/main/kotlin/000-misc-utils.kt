fun <T> Array<T>.print() = print(java.util.Arrays.toString(this))

fun ByteArray.print() = print(java.util.Arrays.toString(this))

fun ShortArray.print() = print(java.util.Arrays.toString(this))

// this one is not different with kotlin.io.print(CharArray)
fun CharArray.print() = print(java.util.Arrays.toString(this))

fun IntArray.print() = print(java.util.Arrays.toString(this))

fun LongArray.print() = print(java.util.Arrays.toString(this))

fun FloatArray.print() = print(java.util.Arrays.toString(this))

fun DoubleArray.print() = print(java.util.Arrays.toString(this))

fun BooleanArray.print() = print(java.util.Arrays.toString(this))

fun main(args: Array<String>) {
    val nums = arrayOf(1,2)
    nums.print()

    val chars = charArrayOf('a', 'b')
    chars.print()
    print(chars)
}