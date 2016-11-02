
package _102_binary_tree_level_order_traversal;

import _000_util.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> levelVals = new ArrayList<>(); // for one level only
        Queue<TreeNode> levelNodes = new LinkedList<>(); // all nodes are not null
        Queue<TreeNode> nextLevelNodes = new LinkedList<>(); // all nodes are not null

        levelNodes.offer(root);
        while (!levelNodes.isEmpty()) {
            TreeNode node = levelNodes.poll();
            assert node != null;
            if(node.left != null)  nextLevelNodes.offer(node.left);
            if(node.right != null) nextLevelNodes.offer(node.right);
            levelVals.add(node.val);

            // transfer next level to current level
            if(levelNodes.isEmpty()) {
                lists.add(levelVals);
                levelVals = new ArrayList<>();

                while (!nextLevelNodes.isEmpty()) {
                    levelNodes.offer(nextLevelNodes.poll());
                }
            }
        }

        return lists;
    }
}
