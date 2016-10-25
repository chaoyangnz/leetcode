
package _144_binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, false));
        while (!stack.empty()) {
            Pair current = stack.pop();
            if(current.node == null) continue;
            if(current.visited) {
                list.add(current.node.val);
            } else {
                // other traversal: change this order
                stack.push(new Pair(current.node.right, false));
                stack.push(new Pair(current.node.left, false));
                stack.push(new Pair(current.node, true));
            }
        }
        return list;
    }

    /*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, false));
        while (!stack.empty()) {
            Pair current = stack.pop();
            if(current.node == null) continue;
            if(current.visited) {
                list.add(current.node.val);
            } else {
                stack.push(new Pair(current.node.right, false));
                stack.push(new Pair(current.node, true));
                stack.push(new Pair(current.node.left, false));
            }
        }
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, false));
        while (!stack.empty()) {
            Pair current = stack.pop();
            if(current.node == null) continue;
            if(current.visited) {
                list.add(current.node.val);
            } else {
                // here!!
                stack.push(new Pair(current.node, true));
                stack.push(new Pair(current.node.right, false));
                stack.push(new Pair(current.node.left, false));
            }
        }
        return list;
    }
    */
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

