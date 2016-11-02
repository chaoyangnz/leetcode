
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

        Queue<TreeNode> thisLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();

        thisLevel.offer(root);
        int level = 1;
        while (!thisLevel.isEmpty()) {
            TreeNode node = thisLevel.poll();
            if(node != null) {
                if(node.left == null && node.right == null) return level;

                nextLevel.offer(node.left);
                nextLevel.offer(node.right);
            }

            if(thisLevel.isEmpty()) {
                level++;
                while (!nextLevel.isEmpty()) {
                    thisLevel.offer(nextLevel.poll());
                }
            }
        }
        return level;
    }

}