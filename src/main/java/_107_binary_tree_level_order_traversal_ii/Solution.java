
package _107_binary_tree_level_order_traversal_ii;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<List<Integer>> listsStack = new Stack<>();
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
            if(!list.isEmpty()) listsStack.push(list);
        }

        while (!listsStack.empty()) {
            lists.add(listsStack.pop());
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
