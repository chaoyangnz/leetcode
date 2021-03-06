
package _114_flatten_binary_tree_to_linked_list;

import _000_util.TreeNode;
import _000_util.TreeNode.Pair;

import java.util.*;

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list
 */
public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<TreeNode>();

        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(root, false));
        while (!stack.empty()) {
            Pair top = stack.pop();
            if(top.node == null) continue;
            if(top.visited) {
                nodes.push(top.node);
            } else {
                stack.push(new Pair(top.node.right, false));
                stack.push(new Pair(top.node.left, false));
                stack.push(new Pair(top.node, true));
            }
        }

        TreeNode head = null;
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            node.right = head;
            node.left = null;
            head = node;
        }
    }
}

