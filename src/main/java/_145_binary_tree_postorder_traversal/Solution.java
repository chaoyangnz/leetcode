
package _145_binary_tree_postorder_traversal;

import _000_util.TreeNode;
import _000_util.TreeNode.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal
 */
public class Solution {
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
                // other traversal: change this order
                stack.push(new Pair(current.node, true));
                stack.push(new Pair(current.node.right, false));
                stack.push(new Pair(current.node.left, false));
            }
        }
        return list;
    }
}