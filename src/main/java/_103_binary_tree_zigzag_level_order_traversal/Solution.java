
package _103_binary_tree_zigzag_level_order_traversal;

import _000_util.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode.Pair> thisLevel = new LinkedList<>(); // all nodes are not null

        thisLevel.offer(new TreeNode.Pair(root, 1));
        int level = 1;
        boolean leftToRight = true;
        List<Integer> list = new ArrayList<>();
        while (!thisLevel.isEmpty()) {
            TreeNode.Pair current = thisLevel.poll();

            if(level < current.level) { // first on in a new level
                if(!leftToRight) Collections.reverse(list);
                lists.add(list);

                leftToRight = !leftToRight;
                list = new ArrayList<>();
                level = current.level;
            }

            list.add(current.node.val);

            assert current.node != null;
            if(current.node.left != null)  thisLevel.offer(new TreeNode.Pair(current.node.left, current.level+1));
            if(current.node.right != null) thisLevel.offer(new TreeNode.Pair(current.node.right, current.level+1));
        }
        if(!leftToRight) Collections.reverse(list);
        lists.add(list); // the last level

        return lists;
    }

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
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
