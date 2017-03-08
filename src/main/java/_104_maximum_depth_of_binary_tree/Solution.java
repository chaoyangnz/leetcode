
package _104_maximum_depth_of_binary_tree;

import _000_util.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
