/**
 * convert a long to binary representation and pad to the specified length with leading zeros
 * @param l
 * *
 * @param paddingTo
 * *
 * @return
 */
fun Long.toBinary(paddingTo: Int = java.lang.Long.SIZE, pretty: Boolean = true): String {
    val l = this

    val sb = StringBuilder(java.lang.Long.SIZE)
    val nonZeroBits = java.lang.Long.SIZE - java.lang.Long.numberOfLeadingZeros(l)
    if (paddingTo < nonZeroBits) {
        throw IllegalArgumentException(String.format("%d exceed padding length %d", l, paddingTo))
    }
    val needPadding = paddingTo - nonZeroBits
    for (i in 0..needPadding - 1) {
        sb.append('0')
    }
    if (nonZeroBits > 0) sb.append(java.lang.Long.toBinaryString(l))

    return if(pretty) prettify(sb.toString()) else sb.toString()
}

private fun prettify(str: String): String {
    val sb = StringBuilder()
    for (i in 0..str.length - 1) {
        if (i != 0 && i % java.lang.Byte.SIZE == 0) {
            sb.append(" ")
        }
        sb.append(str[i])
    }
    return sb.toString()
}

/**
 * convert an integer to binary representation and pad to the specified length with leading zeros

 * @param i
 * *
 * @param paddingTo
 * *
 * @return
 */
fun Int.toBinary(paddingTo: Int = Integer.SIZE, pretty: Boolean = true): String {
    val i: Int = this

    val sb = StringBuilder(Integer.SIZE)
    val nonZeroBits = Integer.SIZE - Integer.numberOfLeadingZeros(i)
    if (paddingTo < nonZeroBits) {
        throw IllegalArgumentException(String.format("%d exceed padding length %d", i, paddingTo))
    }
    val needPadding = paddingTo - nonZeroBits
    for (j in 0..needPadding - 1) {
        sb.append('0')
    }
    if (nonZeroBits > 0) sb.append(Integer.toBinaryString(i))
    return if(pretty) prettify(sb.toString()) else sb.toString()
}

/**
 * Set the specified bit with index from right

 * @param i
 * *
 * @param position
 * *
 * @return
 */
fun Int.setBit(position: Int): Int {
    val i = this

    return i or (1 shl position)
}

/**
 * Clear the specified bit with index from right

 * -1: 11111111 11111111 111111111 111111111

 * @param i
 * *
 * @param position
 * *
 * @return
 */
fun Int.clearBit(position: Int): Int {
    val i: Int = this

    return i and (-1 xor (1 shl position))
}

fun main(args: Array<String>) {
    val a = 13
    println(a.toBinary())

    val b = a.clearBit(2)
    println(b.toBinary())

    val c = a.setBit(1)
    println(c.toBinary())
}