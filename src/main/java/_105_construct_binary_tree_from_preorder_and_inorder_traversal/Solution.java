
package _105_construct_binary_tree_from_preorder_and_inorder_traversal;

import _000_util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        Map<Integer, Integer> indexes = new HashMap<>();
        for(int i = 0; i < inorder.length; ++i) {
            indexes.put(inorder[i], i);
        }

        return build(0, 0, inorder.length, preorder, inorder, indexes);
    }

    private TreeNode build(int preStart, int inStart, int length, int[] preorder, int[] inorder, Map<Integer, Integer> indexes) {
        if(length == 0) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        if(length == 1) return root;

        int index = indexes.get(preorder[preStart]);
        root.left = build(preStart + 1, inStart, index-inStart, preorder, inorder, indexes);
        root.right = build(preStart + 1 + index - inStart, index+1, (length-1)-(index-inStart), preorder, inorder, indexes);
        return root;
    }
}

