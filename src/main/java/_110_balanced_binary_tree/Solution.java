
package _110_balanced_binary_tree;

import _000_util.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/balanced-binary-tree
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        Map<TreeNode, Integer> map = new HashMap<>();

        Stack<TreeNode.Pair> stack = new Stack<>();
        stack.push(new TreeNode.Pair(root, false));
        while (!stack.empty()) {
            TreeNode.Pair current = stack.pop();
            if(current.node == null) continue;
            if(current.visited) {
                Integer leftDepth = map.get(current.node.left);
                if(leftDepth == null) leftDepth = 0;
                Integer rightDepth = map.get(current.node.right);
                if(rightDepth == null) rightDepth = 0;
                if(Math.abs(leftDepth-rightDepth) > 1) return false;
                map.put(current.node, Math.max(leftDepth, rightDepth) + 1);
            } else {
                stack.push(new TreeNode.Pair(current.node, true));
                stack.push(new TreeNode.Pair(current.node.right, false));
                stack.push(new TreeNode.Pair(current.node.left, false));
            }
        }
        return true;
    }
}
