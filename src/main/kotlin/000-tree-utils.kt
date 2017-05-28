
import java.io.PrintStream
import java.util.*

// Definition for a binary tree node.
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    class Pair {
        var node: TreeNode
        var visited: Boolean = false


        constructor(node: TreeNode, visited: Boolean) {
            this.node = node
            this.visited = visited
        }

        var level: Int = 0

        constructor(node: TreeNode, level: Int) {
            this.node = node
            this.level = level
        }
    }
}

/**
 * This way to build a tree is compatible with the leetcode Tree Node Visualizer
 *
 * Print int the Leetcode way
 * @param arr
 * *
 * @return
 */
fun treeOf(vararg arr: Int?): TreeNode? {
    val N = arr.size
    if (N == 0) return null

    val nodes = arrayOfNulls<TreeNode>(N)
    val kids: Queue<TreeNode> = LinkedList()
    for (i in 0..N - 1) {
        nodes[i] = if (arr[i] != null) TreeNode(arr[i]!!) else null
        kids.offer(nodes[i])
    }
    val root = kids.poll()
    for (node in nodes) {
        if (node != null) {
            if (!kids.isEmpty()) node.left = kids.poll()
            if (!kids.isEmpty()) node.right = kids.poll()
        }
    }

    root.print()
    return root
}

fun TreeNode.print() {
    val root: TreeNode = this

    TreePrinter().printPretty(root, 1, 0, System.err)
}

private class TreePrinter {
    // Find the maximum height of the binary tree
    private fun maxHeight(p: TreeNode?): Int {
        if (p == null) return 0
        val leftHeight = maxHeight(p.left)
        val rightHeight = maxHeight(p.right)
        return if (leftHeight > rightHeight) leftHeight + 1 else rightHeight + 1
    }

    // Convert an integer value to string
    private fun intToString(`val`: Int): String {
        //    ostringstream ss;
        //    ss << val;
        //    return ss.str();
        return `val`.toString()
    }

    private var fill = " "
    private fun setw(length: Int, str: String): String {
        if (str.length > length) return str

        var spaces = ""
        val blanks = length - str.length

        for (i in 0..blanks - 1) {
            spaces += fill
        }

        spaces += str
        return spaces
    }

    // Print the arm branches (eg, /    \ ) on a line
    private fun printBranches(branchLen: Int, nodeSpaceLen: Int, startLen: Int, nodesInThisLevel: Int, nodesQueue: Deque<TreeNode>, out: PrintStream) {
        val iter = nodesQueue.iterator()
        for (i in 0..nodesInThisLevel / 2 - 1) {

            var w = if (i == 0) startLen - 1 else nodeSpaceLen - 2
            out.print(setw(w, ""))

            var node: TreeNode? = iter.next()
            out.print(if (node != null) "/" else " ")

            w = 2 * branchLen + 2
            out.print(setw(w, ""))

            node = iter.next()
            out.print(if (node != null) "\\" else " ")
            //      out << ((i == 0) ? setw(startLen-1) : setw(nodeSpaceLen-2)) << "" << ((*iter++) ? "/" : " ");
            //      out << setw(2*branchLen+2) << "" << ((*iter++) ? "\\" : " ");
        }
        out.println()
    }

    // Print the branches and node (eg, ___10___ )
    private fun printNodes(branchLen: Int, nodeSpaceLen: Int, startLen: Int, nodesInThisLevel: Int, nodesQueue: Deque<TreeNode>, out: PrintStream) {
        val iter = nodesQueue.iterator()
        for (i in 0..nodesInThisLevel - 1) {
            val node = iter.next()
            var w = if (i == 0) startLen else nodeSpaceLen
            out.print(setw(w, ""))

            fill = if (node != null && node.left != null) "_" else " "
            w = branchLen + 2
            out.print(setw(w, if (node != null) intToString(node.`val`) else ""))

            fill = if (node != null && node.right != null) "_" else " "
            w = branchLen
            out.print(setw(w, ""))

            fill = " "

            //      out << ((i == 0) ? setw(startLen) : setw(nodeSpaceLen)) << "" << ((*iter && (*iter)->left) ? setfill('_') : setfill(' '));
            //      out << setw(branchLen+2) << ((*iter) ? intToString((*iter)->data) : "");
            //      out << ((*iter && (*iter)->right) ? setfill('_') : setfill(' ')) << setw(branchLen) << "" << setfill(' ');
        }
        //    out << endl;
        out.println()
    }

    // Print the leaves only (just for the bottom row)
    private fun printLeaves(indentSpace: Int, level: Int, nodesInThisLevel: Int, nodesQueue: Deque<TreeNode>, out: PrintStream) {
        val iter = nodesQueue.iterator()
        for (i in 0..nodesInThisLevel - 1) {
            val w = if (i == 0) indentSpace + 2 else 2 * level + 2
            val node = iter.next()
            out.print(setw(w, if (node != null) intToString(node.`val`) else ""))
            //      out << ((i == 0) ? setw(indentSpace+2) : setw(2*level+2)) << ((*iter) ? intToString((*iter)->data) : "");
        }
        //    out << endl;
        out.println()
    }

    // Pretty formatting of a binary tree to the output stream
    // @ param
    // level  Control how wide you want the tree to sparse (eg, level 1 has the minimum space between nodes, while level 2 has a larger space between nodes)
    // indentSpace  Change this to add some indent space to the left (eg, indentSpace of 0 means the lowest level of the left node will stick to the left margin)
    fun printPretty(root: TreeNode, level: Int, indentSpace: Int, out: PrintStream) {
        val h = maxHeight(root)
        var nodesInThisLevel = 1

        var branchLen = 2 * (Math.pow(2.0, h.toDouble()).toInt() - 1) - (3 - level) * Math.pow(2.0, (h - 1).toDouble()).toInt()  // eq of the length of branch for each node of each level
        var nodeSpaceLen = 2 + (level + 1) * Math.pow(2.0, h.toDouble()).toInt()  // distance between left neighbor node's right arm and right neighbor node's left arm
        var startLen = branchLen + (3 - level) + indentSpace  // starting space to the first node to print of each level (for the left most node of each level only)

        val nodesQueue = LinkedList<TreeNode>()
        nodesQueue.offerLast(root)
        for (r in 1..h - 1) {
            printBranches(branchLen, nodeSpaceLen, startLen, nodesInThisLevel, nodesQueue, out)
            branchLen = branchLen / 2 - 1
            nodeSpaceLen = nodeSpaceLen / 2 + 1
            startLen = branchLen + (3 - level) + indentSpace
            printNodes(branchLen, nodeSpaceLen, startLen, nodesInThisLevel, nodesQueue, out)

            for (i in 0..nodesInThisLevel - 1) {
                val currNode = nodesQueue.first
                nodesQueue.pollFirst()
                if (currNode != null) {
                    nodesQueue.offerLast(currNode.left)
                    nodesQueue.offerLast(currNode.right)
                } else {
                    nodesQueue.offerLast(null)
                    nodesQueue.offerLast(null)
                }
            }
            nodesInThisLevel *= 2
        }
        printBranches(branchLen, nodeSpaceLen, startLen, nodesInThisLevel, nodesQueue, out)
        printLeaves(indentSpace, level, nodesInThisLevel, nodesQueue, out)
    }
}

fun main(args: Array<String>) {

    val root = TreeNode(30)
    root.left = TreeNode(20)
    root.right = TreeNode(40)
    root!!.left!!.left = TreeNode(10)
    root.left!!.right = TreeNode(25)
    //    root.right.left = new TreeNode(35);
    root!!.right!!.right = TreeNode(50)
    root.left!!.left!!.left = TreeNode(5)
    root.left!!.left!!.right = TreeNode(15)
    root.left!!.right!!.right = TreeNode(28)
    root.right!!.right!!.left = TreeNode(41)

    val root1 = treeOf(30, 20, 40, 10, 25, null, 50, 5, 15, null, 28, 41)

    //    System.out.println("Tree pretty print with level=1 and indentSpace=0\n\n");
    // Output to console
    TreePrinter().printPretty(root!!, 1, 0, System.err)

    //    System.out.println("\n\nTree pretty print with level=5 and indentSpace=3,\noutput to file \"tree_pretty.txt\".\n\n");
    // Create a file and output to that file
    //    ofstream fout("tree_pretty.txt");
    // Now print a tree that's more spread out to the file
    //    printPretty(root, 5, 0, fout);


}