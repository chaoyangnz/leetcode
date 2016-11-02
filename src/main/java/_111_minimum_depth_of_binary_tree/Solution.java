
package _111_minimum_depth_of_binary_tree;

import _000_util.TreeNode;
import _000_util.TreeNode.Pair;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 */
public class Solution {

    public int minDepth(TreeNode root) {
        Queue<Pair> thisLevel = new LinkedList<>(); // all nodes are not null

        thisLevel.offer(new Pair(root, 1));
        int level = 1;
        while (!thisLevel.isEmpty()) {
            Pair current = thisLevel.poll();

            if(level < current.level) { // first on in a new level
                level = current.level;
            }

            assert current.node != null;
            if(current.node.left == null && current.node.right == null) return level;
            if(current.node.left != null)  thisLevel.offer(new Pair(current.node.left, current.level+1));
            if(current.node.right != null) thisLevel.offer(new Pair(current.node.right, current.level+1));
        }

        return level;
    }

    public int minDepth1(TreeNode root) {
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