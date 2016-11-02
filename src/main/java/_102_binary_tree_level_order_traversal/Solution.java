
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
        Queue<TreeNode> thisLevel = new LinkedList<>(); // all nodes are not null
        Queue<TreeNode> nextLevel = new LinkedList<>(); // all nodes are not null

        thisLevel.offer(root);
        while (!thisLevel.isEmpty()) {
            TreeNode node = thisLevel.poll();
            assert node != null;
            if(node.left != null)  nextLevel.offer(node.left);
            if(node.right != null) nextLevel.offer(node.right);
            levelVals.add(node.val);

            // transfer next level to current level
            if(thisLevel.isEmpty()) {
                lists.add(levelVals);
                levelVals = new ArrayList<>();

                while (!nextLevel.isEmpty()) {
                    thisLevel.offer(nextLevel.poll());
                }
            }
        }

        return lists;
    }
}
