
package _098_validate_binary_search_tree;

/**
 * https://leetcode.com/problems/validate-binary-search-tree
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs((long)Integer.MIN_VALUE-1, root, (long)Integer.MAX_VALUE+1);
    }

    private boolean dfs(long gt, TreeNode node, long lt){
        if(node == null) return true;
        return node.val > gt && node.val < lt &&  dfs(gt, node.left, node.val) && dfs(node.val, node.right, lt);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
