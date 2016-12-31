package _113_path_sum_ii;

import _000_util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/path-sum-ii
 */
public class Solution1 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Stack<Pair> stack = new Stack<>();

        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        Pair pair = new Pair(root, root.val, null);
        stack.push(pair);

        while (!stack.empty()) {
            Pair current = stack.pop();
            if(current.node.left == null && current.node.right == null && current.sum == sum) {
                result.add(getPath(current)); continue;
            }
            if(current.node.right != null) {
                pair = new Pair(current.node.right, current.sum + current.node.right.val, current);
                stack.push(pair);
            }
            if(current.node.left != null) {
                pair = new Pair(current.node.left, current.sum + current.node.left.val, current);
                stack.push(pair);
            }
        }

        return result;
    }

    private static List<Integer> getPath(Pair leaf) {
        List<Integer> path = new LinkedList<>();
        Pair pair = leaf;
        while (pair != null) {
            path.add(0, pair.node.val);
            pair = pair.parent;
        }
        return path;
    }

    private static class Pair {
        TreeNode node;
        int sum;
        Pair parent;

        public Pair(TreeNode node, int sum, Pair parent) {
            this.node = node;
            this.sum = sum;
            this.parent = parent;
        }
    }
}





