
package _111_minimum_depth_of_binary_tree;

import _000_util.TreeNode;
import _000_util.TreeNode.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> levelNodes = new LinkedList<>();
        Queue<TreeNode> nextLevelNodes = new LinkedList<>();

        levelNodes.offer(root);
        int level = 1;
        while (!levelNodes.isEmpty()) {
            TreeNode node = levelNodes.poll();
            if(node != null) {
                if(node.left == null && node.right == null) return level;

                nextLevelNodes.offer(node.left);
                nextLevelNodes.offer(node.right);
            }

            if(levelNodes.isEmpty()) {
                level++;
                while (!nextLevelNodes.isEmpty()) {
                    levelNodes.offer(nextLevelNodes.poll());
                }
            }
        }
        return level;
    }

}