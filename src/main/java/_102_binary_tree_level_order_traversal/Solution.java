
package _102_binary_tree_level_order_traversal;

import _000_util.TreeNode;
import _000_util.TreeNode.Pair;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 */
public class Solution {

    // improved version: use one queue but record the level.
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<Pair> thisLevel = new LinkedList<>(); // all nodes are not null

        thisLevel.offer(new Pair(root, 1));
        int level = 1;
        List<Integer> list = new ArrayList<>();
        while (!thisLevel.isEmpty()) {
            Pair current = thisLevel.poll();

            if(level < current.level) { // first on in a new level
                lists.add(list);
                list = new ArrayList<>();
                level = current.level;
            }

            list.add(current.node.val);

            assert current.node != null;
            if(current.node.left != null)  thisLevel.offer(new Pair(current.node.left, current.level+1));
            if(current.node.right != null) thisLevel.offer(new Pair(current.node.right, current.level+1));
        }
        lists.add(list); // the last level

        return lists;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
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
