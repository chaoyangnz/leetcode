
package _100_same_tree;

import _000_util.TreeNode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/same-tree
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.add(p);
        stack2.add(q);

        while (!stack1.empty() && !stack2.empty()) {
            TreeNode node1 = stack1.pop();
            TreeNode node2 = stack2.pop();

            if(node1 != null && node2 != null && node1.val == node2.val) {
                stack1.add(node1.left);
                stack1.add(node1.right);
                stack2.add(node2.left);
                stack2.add(node2.right);
            } else if(node1 == null && node2 == null) {} else {
                return false;
            }
        }

        return true;
    }
}
