
package _103_binary_tree_zigzag_level_order_traversal;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        boolean leftToRight = true;
        while (!stack.empty()) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> levelNodes = new LinkedList<>();
            // pop all element to another stack
            while (!stack.empty()) {
                levelNodes.offer(stack.pop());
            }
            for(TreeNode node : levelNodes) {
                if(node == null) continue;
                if(leftToRight) {
                    stack.push(node.left);
                    stack.push(node.right);
                } else {
                    stack.push(node.right);
                    stack.push(node.left);
                }
            }
            while (!levelNodes.isEmpty()) {
                TreeNode node = levelNodes.poll();
                if(node == null) continue;

                list.add(node.val);
            }
            leftToRight = !leftToRight;
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
