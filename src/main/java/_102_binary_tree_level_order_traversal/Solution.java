
package _102_binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> levelNodes = new Stack<>();
            // pop all element to another stack
            while (!stack.empty()) {
                levelNodes.push(stack.pop());
            }
            while (!levelNodes.empty()) {
                TreeNode node = levelNodes.pop();
                if(node == null) continue;
                stack.push(node.left);
                stack.push(node.right);
                list.add(node.val);
            }
            if(!list.isEmpty()) lists.add(list);
        }

        return lists;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
