
package _257_binary_tree_paths;

import _000_util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;

        String path = String.valueOf(root.val);
        dfs(root, path, list);

        return list;
    }

    private void dfs(TreeNode node, String path, List<String> list) {
        if(node.left == null && node.right == null) {
            list.add(path);
            return;
        }
        if(node.left != null) {
            dfs(node.left, path + "->" + node.left.val, list);
        }
        if(node.right != null) {
            dfs(node.right, path + "->" + node.right.val, list);
        }
    }
}

