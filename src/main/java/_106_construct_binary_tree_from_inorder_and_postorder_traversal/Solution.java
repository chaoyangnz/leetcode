
package _106_construct_binary_tree_from_inorder_and_postorder_traversal;

import _000_util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0) return null;
        Map<Integer, Integer> indexes = new HashMap<>();
        for(int i = 0; i < inorder.length; ++i) {
            indexes.put(inorder[i], i);
        }

        return build(0, 0, inorder.length, postorder, inorder, indexes);
    }

    private TreeNode build(int postStart, int inStart, int length, int[] postorder, int[] inorder, Map<Integer, Integer> indexes) {
        if(length == 0) return null;

        // root is the last one in post-order
        int val = postorder[postStart + length - 1];
        TreeNode root = new TreeNode(val);
        if(length == 1) return root;

        int index = indexes.get(val);
        root.left = build(postStart, inStart, index-inStart, postorder, inorder, indexes);
        root.right = build(postStart + index - inStart, index+1, (length-1)-(index-inStart), postorder, inorder, indexes);
        return root;
    }
}

