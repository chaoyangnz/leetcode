// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return this.`val`.toString()
    }
}

fun linkedListOf(vararg arr: Int): ListNode? {
    val N = arr.size
    if (N == 0) return null

    val root = ListNode(arr[0])
    var tail: ListNode? = root
    for (i in 1..N - 1) {
        if (tail == null) break
        tail.next = ListNode(arr[i])
        tail = tail.next
    }

    root.print()
    return root
}

fun ListNode.print() {
    val head = this

    var node: ListNode? = head
    val sb = StringBuilder()
    while (node != null) {
        sb.append(node.`val`)
        if (node.next != null) {
            sb.append(" ➟ ")
        }
        node = node.next
    }
    println(sb)
}

operator fun ListNode.get(i: Int): ListNode? {
    val head = this
    if(i < 0) return null

    var j = 0
    var node: ListNode? = head
    while (node != null) {
        if (j == i) return node
        j++
        node = node.next
    }

    return null
}

fun main(args: Array<String>) {
    val head = linkedListOf(1,2,3,4,5)

    print(head!![2])

    val nums = arrayOf(1,2)
//    nums.print()
    print(nums)
}