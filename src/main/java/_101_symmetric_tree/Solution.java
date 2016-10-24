
package _101_symmetric_tree;

import java.util.Stack;

/**
 * https://leetcode.com/problems/symmetric-tree
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetricIterative(TreeNode root) {
        if(root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.right);
        stack.push(root.left);
        while (!stack.empty()) {
            TreeNode l = stack.pop();
            TreeNode r = stack.pop();
            if(l == null && r == null) continue;
            if(l == null && r != null) return false;
            if(l != null && r == null) return false;
            if(l.val != r.val) return false;
            // pair
            stack.push(r.right);
            stack.push(l.left);
            // pair
            stack.push(r.left);
            stack.push(l.right);
        }
        return true;
    }

    private boolean isSymmetric(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        if(l == null && r != null) return false;
        if(l != null && r == null) return false;
        if(l.val != r.val) return false;

        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}