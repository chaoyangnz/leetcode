
package _226_invert_binary_tree;

import _000_util.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}