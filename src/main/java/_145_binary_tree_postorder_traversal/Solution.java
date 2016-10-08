
package _145_binary_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, false));
        while (!stack.empty()) {
            Pair top = stack.pop();
            if(top.node == null) continue;
            if(top.visited) {
                list.add(top.node.val);
            } else {
                stack.push(new Pair(top.node, true));
                stack.push(new Pair(top.node.right, false));
                stack.push(new Pair(top.node.left, false));
            }
        }
        return list;
    }
}

class Pair {
    TreeNode node;
    boolean visited;

    public Pair(TreeNode node, boolean visited) {
        this.node = node;
        this.visited = visited;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}